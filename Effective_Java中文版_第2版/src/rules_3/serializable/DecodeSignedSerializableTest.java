package rules_3.serializable;

import java.io.*;
import java.security.InvalidKeyException;
import java.security.SignatureException;
import java.security.SignedObject;

/**
 * Created by lh on 17-2-20.
 */
public class DecodeSignedSerializableTest {
    public static void main(String[] args) {
        OutputStream out = null;
        try {
            InputStream in=new FileInputStream("signed_temp");
            ObjectInputStream ois=new ObjectInputStream(in);
            SignedObject sout=(SignedObject)ois.readObject();

            //-------------第四步：将原始类信息解密-----------------
            //获得签名值
            Object sign=sout.getObject();
            System.out.println(sign.toString());
            //验证签名
//            boolean status=sout.verify(keyPair.getPublic(), signature);
//            System.out.println(status);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
