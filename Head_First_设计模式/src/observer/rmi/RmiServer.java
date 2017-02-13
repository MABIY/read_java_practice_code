package observer.rmi;

import javafx.beans.InvalidationListener;

import javax.management.remote.rmi.RMIConnection;
import javax.management.remote.rmi.RMIServer;
import java.io.IOException;
import java.io.Serializable;
import java.rmi.AlreadyBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by lh on 17-2-13.
 */
public class RmiServer extends Observable implements RmiService {
    private class WrappedObserver implements Observer, Serializable {
        private static final long serialVersionUTD = 1L;

        private RemoteObserver ro = null;

        public WrappedObserver(RemoteObserver ro) {
            this.ro = ro;
        }

        @Override
        public void update(Observable o, Object arg) {
            try {
                ro.update(o.toString(), arg);
            } catch (RemoteException e) {
                System.out.println("Remote exception removing observer:" +this);
                o.deleteObserver(this);
            }
        }
    }

    @Override
    public void addObserver(RemoteObserver o) throws RemoteException {
        WrappedObserver mo = new WrappedObserver(o);
        addObserver(mo);
        System.out.println("Added observer:" + mo);
    }

    Thread thread = new Thread() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(5 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
            }
                setChanged();
                notifyObservers(new Date());
            }
        }
    };

    public RmiServer() {
        thread.start();
    }

    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try{
            Registry rmiRegistry = LocateRegistry.createRegistry(9999);
            RmiService rmiService = (RmiService) UnicastRemoteObject.exportObject(new RmiServer(), 9999);
            rmiRegistry.bind("RmiService", rmiService);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
