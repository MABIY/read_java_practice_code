package serializable;

import java.io.*;

/**
 * url :https://www.ibm.com/developerworks/cn/java/j-lo-serial/
 * Created by lh on 17-2-19.
 */
public class Test implements Serializable {
    private static final long serialVersionUID = 1L;

    private Test() {
        System.out.println("test");
    }

    public static int staticVar = 5;

    public static void main(String[] args)  {
        try{
            //初始时staticVar 为5
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("result.obj"));
            Test test = new Test();
            out.writeObject(test);
            out.close();

            //序列化后修改为10
            Test.staticVar = 10;

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
