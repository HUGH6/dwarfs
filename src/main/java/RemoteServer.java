import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;

public class RemoteServer {
    public static void main(String[] args) {
        UserHandler userHandler = null;

        try {
            Registry registry = LocateRegistry.createRegistry(1099);

            userHandler = new UserHandlerImpl();
            Naming.rebind("user", userHandler);

            System.out.println("rmi server is ready ...");
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
