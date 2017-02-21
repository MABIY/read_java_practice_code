package java_extend;

/**
 * Created by lh on 17-2-21.
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
//        this method will return null in such implementations. if this class was loaded by the bootstrap class loader
        System.out.println(String.class.getClassLoader());
    }
}
