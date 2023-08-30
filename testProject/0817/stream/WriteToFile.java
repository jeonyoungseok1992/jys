package stream;
import java.io.*;
import java.util.*;
public class WriteToFile {

	public static void main(String[] args) {
		String filpath = "myFile2.txt";
		File f = new File(filpath);
		try {
			boolean isTrue = f.createNewFile();
			if(isTrue)
				System.out.println("생성 성공");
			else
				System.out.println("생성 실패");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	
       try {
            OutputStream out1 = new FileOutputStream(filpath); 
            out1.write(5);
       }
       catch(IOException a) {
    	   a.printStackTrace();
    	   
       }
       try {
    	   InputStream in = new FileInputStream(filpath);
    	   System.out.println(in.read());
       }
       catch(IOException e) {
    	   e.printStackTrace();
       }

    }
}
