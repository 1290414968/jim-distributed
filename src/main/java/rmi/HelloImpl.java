package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements  IHello {
    protected HelloImpl() throws RemoteException {
    }
    public void say(String msg) throws RemoteException {
        System.out.println("mmmm--->"+msg);
    }
}
