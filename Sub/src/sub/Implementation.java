 package sub;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Implementation extends UnicastRemoteObject implements Sub {

    public Implementation() throws RemoteException {
    }

    @Override
    public int substract(int x, int y) throws RemoteException {
        return x - y;
    }

    @Override
    public int mult(int i, int j) throws RemoteException {
        return i * j;
    }   
  
}
