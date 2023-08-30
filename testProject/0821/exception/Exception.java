package exception;
import java.io.*;

public class Exception {
   public static void main(String[] args) {
      String filePath = "com.myFile.txt";         //com.~ 여기가 저장위치 - 설정해주지않으면 Project Explorer에 생성된다
      
      try {
         File file = new File(filePath);            //단순히 file객체 생성 실제 파일 생성 x
         boolean isFileCreated = file.createNewFile(); //이 때 file.createNewFile()가 file객체에 filepath경로에 실제 파일을 만들어준다
         						//try catch 지우면 createNewFile() 컴파일 에러 뜬다 - 예외처리 throws 적혀있기때문에
         if (isFileCreated) {
            System.out.println("파일 생성 완료 : " + filePath);
         } else {
            System.out.println("파일 생성 실패");
         }
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      try {
         OutputStream out = new FileOutputStream(filePath);     //파일에 저장
         //-----------------------
         String data = "7";
         out.write(data.getBytes());
         //-----------------------
         out.close();
      } catch(IOException e) {
         e.printStackTrace();
      }
      
      try ( InputStream in = new FileInputStream(filePath);){
              //파일에 저장된거 모니터에 출력
         //-----------------------
            int readByte = in.read();
            System.out.println((char) readByte);
            
            //-------------
      } catch (IOException e) {
         e.printStackTrace();
      }
      
      
      try (FileWriter fw = new FileWriter(filePath, true)){
          fw.append("안녕");
          fw.append("영석");
       } catch (IOException e) {
          e.printStackTrace();
       }
       
       try {
          BufferedReader br = new BufferedReader(new FileReader(filePath));
           String line = br.readLine();
           while (line != null) {
               System.out.println(line);
               line = br.readLine();
           }
       } catch (IOException e) {
           e.printStackTrace();
       }

    }
 }
