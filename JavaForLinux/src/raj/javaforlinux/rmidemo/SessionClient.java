package raj.javaforlinux.rmidemo;

import java.rmi.*;

public class SessionClient {
    public static void main(String[] args) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }

        try {
            String name = "//sahae/Session";
            // Obtain reference to the remote object
            Session sess = (Session) Naming.lookup(name);

            System.out.println("Pointless RMI Client. 47 + 13 = " +
                    sess.add(47,13) + ", right?");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

