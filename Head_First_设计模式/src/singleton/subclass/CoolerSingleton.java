package singleton.subclass;

/**
 * Created by lh on 17-2-19.
 */
public class CoolerSingleton extends Singleton{
    // useful instance variables here
    protected static Singleton uniqueInstance;

    private CoolerSingleton() {
        super();
    }

    // useful method here
}
