package observer.wheather;

/**
 * Created by lh on 17-2-8.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
