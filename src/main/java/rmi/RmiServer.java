package rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RmiServer {
    public static void main(String[] args) throws RemoteException {
        IHello hello = new HelloImpl();
        LocateRegistry.createRegistry(8888);
        try {
            Naming.bind("rmi://localhost:8888/hello",hello);
            System.out.println("server success");
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
