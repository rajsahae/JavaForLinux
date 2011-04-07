package raj.javaforlinux.test;
import java.net.*;
import java.io.*;

public class FetchURL {
	private URL requestedURL;

	public FetchURL(String urlName) {
		try {
			requestedURL = new URL(urlName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		String rc = "";
		String line;
		BufferedReader rdr;

		try {
			rdr = new BufferedReader( new InputStreamReader( 
				requestedURL.openConnection().getInputStream()));

				while((line = rdr.readLine()) != null) {
					rc += line + "\n";
				}
			} catch (Exception e) {
				e.printStackTrace();
				rc = null;
			}

			return rc;
		}

		public static void main(String[] args) {
			FetchURL f;

			for(int i=0; i<args.length; i++) {
				System.out.println(args[i] + ":");
				System.out.println(new FetchURL(args[i]));
			}
		}
}

