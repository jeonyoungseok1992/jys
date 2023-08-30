package TCP_Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalComputerIp {

	public static void main(String[] args) {
		
		try {
			InetAddress LA = InetAddress.getLocalHost();
			String ip = LA.getHostAddress();
			System.out.println("로컬 컴퓨터 IP : "+ip);
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		}


	}

}
