package rules_3;

import java.io.*;

/**
 * Created by lh on 17-2-19.
 */
// Singleton with public final field
public class Elvis implements Serializable{
    public static transient final Elvis INSTANCE = new Elvis();

    private Elvis() {
        System.out.println("Elvis Test");
    }

    public void leaveTheBuilding() {
        System.out.println("leaveTheBuilding");
    }

    // 通过反序列化类的方式调用 readResolve
    private Object readResolve() {
        return INSTANCE;
    }
}

class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Write obj to file
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
//        oos.writeObject(Elvis.INSTANCE);
        //Read Obj from file
        File file = new File("tempFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        // 通过反序列化类的方式调用 readResolve
        Elvis newInstance = (Elvis) ois.readObject();
        // 判断是否是同一个对象
        System.out.println(newInstance == Elvis.INSTANCE);
    }
}
