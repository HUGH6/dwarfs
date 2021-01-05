import domain.User;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UserHandlerImpl extends UnicastRemoteObject implements UserHandler {
    public UserHandlerImpl() throws RemoteException {
        super();
    }

    @Override
    public String getUserName(int id) throws RemoteException {
        return "user name is No." + id;
    }

    @Override
    public int getUserCount() throws RemoteException {
        return 100;
    }

    @Override
    public User getUserByName(String name) throws RemoteException {
        return new User("Tom", 30);
    }
}
