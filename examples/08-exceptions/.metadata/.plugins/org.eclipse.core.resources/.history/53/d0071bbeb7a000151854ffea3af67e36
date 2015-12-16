package exceptions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class E05_ThrowMethods {
	

	public static void main(String[] args) {
		try {
			readFile("..\\files\\test.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void readFile(String fileName)
	        throws FileNotFoundException, IOException {
		
	    FileInputStream fileInputStream = null;
	    
	    fileInputStream = new FileInputStream(fileName);
	    
	    BufferedReader buffer = new BufferedReader(new InputStreamReader(fileInputStream));
	    String temp = null;
	    while ((temp = buffer.readLine()) != null) {
	        System.out.println(temp);
	    }
	    
	    buffer.close();
	    
	    fileInputStream.close();
	}

}
