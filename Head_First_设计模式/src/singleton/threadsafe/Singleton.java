package singleton.threadsafe;

/**
 * Created by lh on 17-2-19.
 */
public class Singleton {
    private static Singleton uniqueInstance;


    // other useful instance variables here


    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }


    /**
     *  other useful method here
     *
     * @return the description
     */
    public String getDescription() {
        return "I'm a thread safe Singleton!";
    }
}
