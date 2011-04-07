package raj.javaforlinux.test;
import java.io.*;

public class Exec {

    public static void main(String[] args) throws IOException {
        String ln;
        Process p = Runtime.getRuntime().exec(args);
        BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));

        while( (ln = br.readLine()) != null) {
            System.out.println(ln);
        }
        System.out.println("returns: " + p.exitValue());
    }
}

