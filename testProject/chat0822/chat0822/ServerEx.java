package chat0822;
import java.io.*;
import java.net.*;
import java.util.*;
public class ServerEx {

	public static void main(String[] args) {
		ServerSocket ssk = null;
		Socket sk = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner Sc = new Scanner(System.in);
		
		try {
			ssk = new ServerSocket(9998);
			System.out.println("연결 대기중......");
			
			sk = ssk.accept();
			System.out.println("연결 되었습니다");
			
			br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
			
			while(true) {
				String inMsg = br.readLine();
				if(inMsg.equals("bye")) {
					System.out.println("클라이언트가 나갔습니다");
					break;
				}
				//바이 가 아닌경우
				System.out.println("클라이언트 : " + inMsg);
				System.out.println("보내기 >>");
				String outMsg = Sc.nextLine();
				bw.write(outMsg + "\n");
				bw.flush();
			
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			
			try {
				Sc.close();
				bw.close();
				ssk.close();
				sk.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
