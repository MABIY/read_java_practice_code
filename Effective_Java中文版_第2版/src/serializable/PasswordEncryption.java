package serializable;

import java.io.*;

/**
 * Created by lh on 17-2-20.
 */
public class PasswordEncryption implements Serializable{
    public static final long serialVersionUID = 1L;

    private String password = "pass";

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void writeObject(ObjectOutputStream out) {
        try {
            ObjectOutputStream.PutField putFields = out.putFields();
            System.out.println("原密码: " + password);
            password = "encryption";
            putFields.put("password" , password);
            System.out.println("加密后的密码: " + password);
            out.writeFields();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream in) {
        try {
            ObjectInputStream.GetField readFields = in.readFields();
            Object object = readFields.get("password", "");
            System.out.println("要解密的字符串" + object.toString());
            password = "pass"; // 模拟解密,需要获得本地的密码
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("result.obj"));
            out.writeObject(new PasswordEncryption());
            out.close();

            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("result.obj"));
            PasswordEncryption t = (PasswordEncryption) oin.readObject();
            System.out.println("解密后的字符串: " + t.getPassword());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
