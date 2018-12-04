package sub;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Sub extends Remote {

    public int substract(int x, int y) throws RemoteException;

    public int mult(int i, int j) throws RemoteException;
}
