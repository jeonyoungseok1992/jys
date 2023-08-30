package testProject22;
import java.net.Socket;
import java.io.IOException;
import java.net.ServerSocket;

public class server0822 {

	public static void main(String[] args) {
		int port = 3000;
		
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(port);
			
			Socket client = server.accept();
		

			
			
		} catch (IOException e) {			
			e.printStackTrace();
		}

	}

}
