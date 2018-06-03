package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloService extends Remote {
    public void say(String msg) throws RemoteException;
}
