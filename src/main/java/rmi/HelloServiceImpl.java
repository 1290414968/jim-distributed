package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements IHelloService {
        HelloServiceImpl() throws RemoteException {
            super();
        }
        public void say(String msg) throws RemoteException {
            System.out.println("mmmm--->"+msg);
        }
    }

