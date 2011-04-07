package raj.javaforlinux.test;
/*
 * simple environment examiner
 */
import java.util.*;

public class AllEnv {
    public static void main(String[] args) {
        Properties props = java.lang.System.getProperties();
        for (Enumeration enm = props.propertyNames(); enm.hasMoreElements();) {
            String key = (String) enm.nextElement();
            System.out.print(key);
            System.out.print(" = ");
            System.out.println(props.getProperty(key));
        }
    }
}
