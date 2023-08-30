package stream;
import java.io.*;
import java.util.*;
public class WriterAndReader {
	public static void main(String[] args) {
		
	String str = "filename";
	
	try(Writer writer = new FileWriter(str)){
		writer.write("hello");
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
    try (Reader reader = new FileReader(str)) {
        int character;
        while((character = reader.read()) != -1) {
        	System.out.println((char)character);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}