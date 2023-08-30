package testProject22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client0822 {
	public static void main(String[] args) {


	BufferedWriter bw = null;
	
	try {
		bw = new BufferedWriter(new FileWriter("test.txt", true));
		bw.write("안녕하세요");
		bw.write("반갑습니다");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}


	
	
	}
	
}
