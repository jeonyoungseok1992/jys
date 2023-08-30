package exception;
import java.io.*;

public class Exception22222 {
	   public static void main(String[] args) {
		   String filePath = "myFile148119.txt";
		   
		   File f = new File(filePath);
		   try {
			boolean c = f.createNewFile();
			
			if(c) {
				System.out.println("생성 완료 : " + filePath);
			}else {
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		   

		   
		   try {
			FileWriter fw = new FileWriter(f);
			fw.write("전영석22\n");
			fw.write("하이\n");
//			fw.write("전영석\n");

			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   try {
			FileReader fr = new FileReader(f);
			int data;
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			}
			} catch (IOException e) {
			
			e.printStackTrace();
		}
		   
		   
		   
		   
	   }
}
