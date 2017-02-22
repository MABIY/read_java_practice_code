package java_extend.classLoader.jar;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * 通过 URLClassLoader
 * Created by lh on 17-2-22.
 */
public class URLClassLoaderTest {
    public static void main(String[] args) throws MalformedURLException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InstantiationException {
        URLClassLoader classLoader = URLClassLoader.newInstance(new URL[]{new URL("file:/home/lh/test.jar")});
        URLClassLoader classLoader1 = URLClassLoader.newInstance(new URL[]{new URL("file:/home/lh/test.jar")});
        // 2 个 ClassLoader 同一级别 不会判断类是否加载 , 系统 提供的Bootstrap ClassLoader Extension ClassLoader Application ClassLoader  所以是单例
        Class cls = classLoader.loadClass("java_extend.classLoader.jar.Main");
        Object obj1 = cls.newInstance();
        Class mm = classLoader1.loadClass("java_extend.classLoader.jar.Main");
        Object obj2 = mm.newInstance();
        Method method = cls.getMethod("setSample", java.lang.Object.class);
        method.invoke(obj1,obj2);
    }
}
