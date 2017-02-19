package serializable;

import java.io.*;

/**
 * Created by lh on 17-2-19.
 */
public class Test implements Serializable {
    private static final long serialVersionUID = 1L;

    public static int staticVar = 10;

    public static void main(String[] args)  {
        try{


            ObjectInputStream oin = new ObjectInputStream(new FileInputStream("result.obj"));
            Test t = (Test) oin.readObject();
            oin.close();

            System.out.println(t.staticVar);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
