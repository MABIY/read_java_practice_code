package serializable;

import java.io.*;

/**
 * Created by lh on 17-2-20.
 */
public class Test1 implements Serializable{
    public int i;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("result.obj"));
        Test1 test1 = new Test1();
        test1.i = 1;
        out.writeObject(test1);
        out.flush();
        System.out.println(new File("result.obj").length());
        Test1 test11 = new Test1();
        test11.i = 2;
        out.writeObject(test11);
        out.close();
        System.out.println(new File("result.obj").length());
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("result.obj"));

        Test1 t1 = (Test1) oin.readObject();
        Test1 t2 = (Test1) oin.readObject();

        System.out.println(t1 == t2);
        System.out.println("i :" +t1.i);
        System.out.println("i:" + t2.i);
    }
}
