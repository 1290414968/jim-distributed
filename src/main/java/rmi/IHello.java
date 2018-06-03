package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote {
    void say(String msg) throws RemoteException;
}
