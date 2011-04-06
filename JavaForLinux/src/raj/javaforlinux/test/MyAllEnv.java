package raj.javaforlinux.test;
/*
 * simple environment examiner
 */
import java.util.*;
import java.io.*;

public class MyAllEnv {
    public static void main(String[] args) 
            throws IOException, FileNotFoundException {
        String envfile = System.getProperty("ENVFILE", ".envfile");

        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream(envfile));

        Properties prop = new Properties();
        prop.load(bis);
        bis.close();

        prop.list(System.out);

        Properties props = java.lang.System.getProperties();
        Set<String> keys = props.stringPropertyNames();

        for (String key : keys) {
            System.out.print(key);
            System.out.print(" = ");
            System.out.println(props.getProperty(key));
        }

    }
}

