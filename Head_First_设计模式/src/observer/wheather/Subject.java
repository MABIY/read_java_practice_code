package observer.wheather;

/**
 * Created by lh on 17-2-8.
 */
public interface Subject {
   void registerObserver(Observer o);

   void removeObserver(Observer o);

   void notifyObservers();
}
