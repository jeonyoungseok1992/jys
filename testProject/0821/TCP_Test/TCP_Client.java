package TCP_Test;
import java.net.*;
import java.io.*;

public class TCP_Client {

	public static void main(String[] args) {
		System.out.println("Client Start");
		
		try {                      //InetAdress안에는 객체정보가 들어있다
			Socket socket = new Socket(InetAddress.getByName("localhost"), 5000);  //만들자마자 서버에 요청 던진다
			System.out.println("서버 접속 완료");
			System.out.println("접속 한 서버IP : " + socket.getInetAddress().getHostAddress());
			
			InputStream is = socket.getInputStream();
			BufferedInputStream br = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(br);
			
			OutputStream os = socket.getOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);
			
			//보내기
			String message = "안녕";
			byte[] data = message.getBytes();
			dos.write(data);
			dos.close();
//			dos.writeUTF("안녕하세요");
//			dos.flush();
			
			//받기
			String str = dis.readUTF();
			System.out.println(str);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
