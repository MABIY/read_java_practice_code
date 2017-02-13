package observer.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by lh on 17-2-13.
 */
public interface RmiService extends Remote {
    void addObserver(RemoteObserver o) throws RemoteException;
}
