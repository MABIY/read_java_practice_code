package observer.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by lh on 17-2-13.
 */
public interface RemoteObserver extends Remote {
    void update(Object observable, Object updateMsg) throws RemoteException;
}
