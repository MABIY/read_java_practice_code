package singleton.stat;

/**
 * Created by lh on 17-2-19.
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
    // other useful methods here
    public String getDescription() {
        return "I'm a statically intialized Signleton!";
    }
}
