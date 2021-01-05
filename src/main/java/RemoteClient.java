import domain.User;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Arrays;

public class RemoteClient {
    public static void main(String[] args) {
        try {
            UserHandler handler = (UserHandler) Naming.lookup("user");

            int count = handler.getUserCount();
            String name = handler.getUserName(100);
            User user = handler.getUserByName("Tom");

            System.out.println(count);
            System.out.println(name);
            System.out.println(user);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
