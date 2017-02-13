package observer.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by lh on 17-2-13.
 */
public class RmiClient extends UnicastRemoteObject implements RemoteObserver {

    public RmiClient() throws RemoteException {
        super();
    }

    private static final long serialVersionUID =1L;

    @Override
    public void update(Object observable, Object updateMsg) throws RemoteException {
        System.out.println("got message:" + updateMsg);
    }

    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            RmiService remoteService = (RmiService) Naming.lookup("//localhost:9999/RmiService");
            RmiClient client = new RmiClient();
            remoteService.addObserver(client);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
