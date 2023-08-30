package TCP_Test;
import java.net.*;
import java.io.*;

public class TCP_Client2 {

	public static void main(String[] args) {
		System.out.println("Client Start");
		
		try {
			Socket s = new Socket(InetAddress.getByName("localhost"), 5020);
			OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
			
			BufferedReader isr = new BufferedReader( new InputStreamReader(s.getInputStream()));
			
			osw.write("안녕");
			osw.flush();
			
            String line;
            while ((line = isr.readLine()) != null) {
                System.out.println(line);
            }
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
