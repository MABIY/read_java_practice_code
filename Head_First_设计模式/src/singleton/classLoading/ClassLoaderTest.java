package singleton.classLoading;

/**
 * Created by lh on 17-2-20.
 */
public class ClassLoaderTest {
    /**
     *
     *  动态类加载 Dynamic Class Loading
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        try {
            Class<?> aClass = classLoader.loadClass("singleton.classLoading.ClassLoaderTest");
            System.out.println("aClass.getName() = " + aClass.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
