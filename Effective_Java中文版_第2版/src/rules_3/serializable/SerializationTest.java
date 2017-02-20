package rules_3.serializable;

import javax.crypto.*;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

/**
 * Created by lh on 17-2-20.
 */
public class SerializationTest {
    private static Key _key = null;


    public void serialize() throws IOException, IllegalBlockSizeException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {
        Employee em  = new Employee("Matt",10000);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("employee.save");
            oos = new ObjectOutputStream(fos);

            KeyGenerator keyGenerator = KeyGenerator.getInstance("DESede");

            _key = keyGenerator.generateKey();
            Cipher cipher = Cipher.getInstance("DESede");
            cipher.init(Cipher.ENCRYPT_MODE, _key);
            SealedObject so = new SealedObject(em,cipher);
            oos.writeObject(so);
            System.out.println("Serialized - "+ em.toString());

        }finally{
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public void deSerialize() throws ClassNotFoundException, IOException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("employee.save");
            ois = new ObjectInputStream(fis);
            SealedObject so = (SealedObject)ois.readObject();
            Employee e = (Employee) so.getObject(_key);
            System.out.println("Deserialized - "+ e.toString());
        }finally{
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException {
        SerializationTest st = new SerializationTest();
        st.serialize();
        st.deSerialize();

    }
}
