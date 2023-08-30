package TCP_Test;
import java.io.IOException;
import java.net.*;
import java.io.*;

public class TCP_Server2 {

	public static void main(String[] args) {
		System.out.println("Server Start");
		String serverIp = null;
		
		int port = 5020;
		
		try {
			ServerSocket sv = new ServerSocket(port);
			serverIp = sv.getInetAddress().getHostAddress();
			System.out.println("서버ip : "+serverIp);
			System.out.println("요청 대기 중");
			Socket cs = sv.accept();
			
			String csip = cs.getInetAddress().getHostAddress();
			System.out.println("클라이언트 ip : "+ csip);
			
			BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			
			PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
			
			
			String str = br.readLine();
			System.out.println("클라이언트로부터으 메세지 : "+str);
			
			pw.write("회신");
			pw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		
		

	}

}
