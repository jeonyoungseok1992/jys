package testProject22;
import java.io.*;
import java.util.*;
public class FoodMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Food Fd = new Food();
		String filename;
		filename = sc.next();
		File f = new File(filename);
		
		try {
			Boolean isfile = f.createNewFile();
				if(isfile)
					System.out.println("파일 생성 성공");
				else
					System.out.println("파일 생성 실패");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Fd.setkcal(20);
		Fd.setName("사과");
		
		try {
			FileInputStream fs = new FileInputStream(f);
			ObjectInputStream ip = new ObjectInputStream(fs);
			
			FileOutputStream fo = new FileOutputStream(f);
			ObjectOutputStream op = new ObjectOutputStream(fo);
			

			op.writeObject(Fd);
			ip.readObject(ip.readLine(Fd));
			
			fo.close();
			ip.close();
		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		

	}

}
