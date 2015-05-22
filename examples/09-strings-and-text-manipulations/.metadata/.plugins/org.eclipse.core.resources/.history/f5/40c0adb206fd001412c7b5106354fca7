import java.io.BufferedReader;
import java.io.FileReader;


public class RedingLineByLine {

	public static void main(String[] args) {
		readFile("../files/java.txt");

	}
	
	public static void readFile(String path){
		try {
			
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
			  String line = bufferedReader.readLine();
			  System.out.println(line);
			}
			
			bufferedReader.close();
			
		} catch (Exception e) {
			System.out.println("Възникна грешка при четенето на файла");
			System.out.println(e.getMessage());
		}
	}

}
