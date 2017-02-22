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
    public static void main(String[] args) throws MalformedURLException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException {
        URLClassLoader classLoader = URLClassLoader.newInstance(new URL[]{new URL("file://home/lh/test.jar")});
        Main main = new Main();
        Main.main(null);
        Class cls = classLoader.loadClass("java_extend.classLoader.jar.Main");
        Method method = cls.getMethod("main", String[].class);
        String[] params = new String[2];
        method.invoke(null, (Object) params);
    }
}
