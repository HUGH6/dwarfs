import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiClient {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            RemoteHelloWorld helloWorld = (RemoteHelloWorld) registry.lookup("helloworld");
            String res = helloWorld.sayHello();
            System.out.println(res);
        } catch (RemoteException e) {

        } catch (NotBoundException e) {

        }
    }
}
