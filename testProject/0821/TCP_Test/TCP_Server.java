package TCP_Test;
import java.io.IOException;
import java.net.*;
import java.io.*;

public class TCP_Server {

	public static void main(String[] args) {
		System.out.println("Server Start");
		
//		String serverIP = null;
		//port는 1024번까지는 이미 사용되는 포트(겹치면 안됨)
		int port = 5000;
		//서버소켓 참조변수 선언
		ServerSocket serverSocket = null;
		
		try {
		//serverSocket객체생성 => port를 정해줘야한다
		serverSocket = new ServerSocket(port);
		
		//생성된 serverSocket객체에서 서버의 InetAddress() ip정보를 가진 객체
		//가지고 온 뒤 IP를 확인한다
//		serverIP = serverSocket.getInetAddress().getHostAddress();
		
		//accept메서드는 클라이언트의 요청을 기다렸다가
		//요청이 도착하면 클라이언트가 보내준 해당 소켓정보를 받은 후 clinetSocket에 넘겨준다(소켓객체 생성)
		System.out.println("요청 대기 중....");
		Socket clientSocket = serverSocket.accept();      //요청 대기중인 상태
		
		
		//요청받은 clientSocket객체에서 InetAddress() ip정보를 가진 객체
		//가지오 온 뒤 IP를 확인한다
//		String clientIP = clientSocket.getInetAddress().getHostAddress();
//		System.out.println("클라이언트 접속 확인 : " + clientIP);
		
		//클라이언트소켓 안에 인풋아웃풋스트림이 들어있다
		InputStream is = clientSocket.getInputStream();
		BufferedInputStream br = new BufferedInputStream(is);
		DataInputStream dis = new DataInputStream(br);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		OutputStream os = clientSocket.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(os);
		DataOutputStream dos = new DataOutputStream(bos);
		
		//받은 요청 출력부분
		String str = dis.readUTF();
		System.out.println(str);
		//다시 클라이언트에게 응답전달
		dos.writeUTF("반갑습니다");
		dos.flush();
		
		}
		
		
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
