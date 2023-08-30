package chat0822;
import java.io.*;
import java.net.*;
import java.util.*;
import java.net.*;
import java.util.*;
public class ClientEx {

	public static void main(String[] args) {

		Socket sk = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		Scanner Sc = new Scanner(System.in);
		
		try {
			sk = new Socket("localhost", 9998);


			br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(sk.getOutputStream()));
			
			while(true) {
				
				System.out.println("보내기 >>");
				String outMsg = Sc.nextLine();
				if(outMsg.equals("bye")) {
					bw.write(outMsg + "\n");
					bw.flush();;
					break;
				}
				//바이가 아닌경우 
				bw.write(outMsg + "\n");
				bw.flush();
				
				String inMsg = br.readLine();
				System.out.println("서버>> : " + inMsg);

			
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			
			try {
				Sc.close();
				bw.close();
				sk.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

