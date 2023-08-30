package inout;
import java.io.*;
public class Stream {
	public static void main(String[] args) {
		String filePath2 = "myFile.txt";
		File file = new File(filePath2);
		
		try {
			boolean isfileCreated = file.createNewFile();
			
			if(isfileCreated) {
				System.out.println("파일 생성 완료 : " +filePath2);
			}
			else {
				System.out.println("파일 생성 실패");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try (OutputStream out = new FileOutputStream(filePath2);
				InputStream in = new FileInputStream(filePath2)){			   //업캐스팅
			out.write(5);
			System.out.println(in.read());
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		
		
	}
}
