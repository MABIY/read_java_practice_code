package singleton.subclass;

/**
 * Created by lh on 17-2-19.
 */
public class SingletonTestDrive {
    public static void main(String[] args) {
        Singleton foo = CoolerSingleton.getInstance();
        Singleton bar = HotterSingleton.getInstance();
        System.out.println(foo);
        System.out.println(bar);
    }
}
