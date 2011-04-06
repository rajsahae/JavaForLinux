package raj.javaforlinux.rmidemo;

import java.rmi.*;

public interface Session extends Remote {
    public int add(int x, int y) throws RemoteException;
}

