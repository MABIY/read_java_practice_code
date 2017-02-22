package java_extend.classLoader;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by lh on 17-2-21.
 */
public class ClassLoaderTest{
    /**
     * this method will return null in such implementations. if this class was loaded by the bootstrap class loader
     *
     * @param args the input arguments
     */
//    public static void main(String[] args) {
//        System.out.println(String.class.getClassLoader());
//    }
    public static void main(String[] args) {
        System.out.println("ClassLoaderTest.getClass().getClassLoader() :" +
                ClassLoaderTest.class.getClassLoader());
       // trying to explicitly  load this class again using Extension class loader
        try {
            Class.forName("java_extend.classLoader.ClassLoaderTest", true, ClassLoaderTest.class.getClassLoader().getParent());

        } catch (ClassNotFoundException e) {
            Logger.getLogger(ClassLoaderTest.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
