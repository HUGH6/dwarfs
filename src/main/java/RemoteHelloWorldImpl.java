import java.rmi.RemoteException;

public class RemoteHelloWorldImpl implements RemoteHelloWorld{
    @Override
    public String sayHello() throws RemoteException {
        return "hello world";
    }
}
