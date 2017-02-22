package java_extend.classLoader.test;

import java.lang.reflect.Method;

/**
 * refer https://www.ibm.com/developerworks/cn/java/j-lo-classloader/
 * Created by lh on 17-2-22.
 */
public class ClassLoaderTree {
    /**
     * 系统提供的类加载器 引导类加载器 扩展类加载器 系统类加载器  树状组织结构
     *需要注意的是这里并没有输出引导类加载器，这是由于有些 JDK 的实现对于父类加载器是引导类加载器的情况，
     * getParent()方法返回 null。
     * @param args the input arguments
     */
//    public static void main(String[] args) {
//        ClassLoader loader = ClassLoaderTree.class.getClassLoader();
//        while (loader != null) {
//            System.out.println(loader.toString());
//            loader = loader.getParent();
//        }
//    }
    public static void main(String[] args) {
        testClassIdentity();
    }

    public static void testClassIdentity() {
        String classDataRootPath = "/home/lh/project/read_java_practice_code/out/production/Java编程思想(第4版)";
        FileSystemClassLoader fscl1 = new FileSystemClassLoader(classDataRootPath);
        FileSystemClassLoader fscl2 = new FileSystemClassLoader(classDataRootPath);
        String className = "java_extend.classLoader.test.Sample";
        try {
            Class<?> class1 = fscl1.loadClass(className);
            Object obj1 = class1.newInstance();
            Class<?> class2 = fscl2.loadClass(className);
            Object obj2 = class2.newInstance();
            Method setSampleMethod = class1.getMethod("setSample", java.lang.Object.class);
            setSampleMethod.invoke(obj1, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
