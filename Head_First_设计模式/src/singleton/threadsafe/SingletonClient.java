package singleton.threadsafe;

/**
 * Created by lh on 17-2-19.
 */
public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
