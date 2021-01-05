import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer {
    public static void main(String[] args) {
        try {
            RemoteHelloWorld remoteHelloWorld = new RemoteHelloWorldImpl();
            RemoteHelloWorld stub = (RemoteHelloWorld)UnicastRemoteObject.exportObject(remoteHelloWorld, 9999);
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("helloworld", stub);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }
}
