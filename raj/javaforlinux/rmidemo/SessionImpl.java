package raj.javaforlinux.rmidemo;

import java.rmi.*;
import java.rmi.server.*;

/**
 * SessionImpl is the server class for the Session RMI interface.
 */

public class SessionImpl extends UnicastRemoteObject implements Session {
    /**
     * Constructor needed to ensure call to UnicastRemoteObject constructor
     * and to thus propagate the possible exception.
     */
    public SessionImpl() throws RemoteException {
        super();
    }

    /**
     * A static main() for the server.
     */
    public static void main(String[] arglist) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }

        String rmiName = "//sahae/Session";
        try {
            Session adder = new SessionImpl();
            Naming.rebind(rmiName, adder);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Implementation of the RMI method, add.
     */
    public int add(int x, int y) throws RemoteException {
        return x+y;
    }
}
