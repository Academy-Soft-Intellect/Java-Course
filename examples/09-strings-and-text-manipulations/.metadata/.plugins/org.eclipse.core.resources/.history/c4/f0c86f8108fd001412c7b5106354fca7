import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class WritingFIles {

	public static void main(String[] args) {

		String filePath = "../output/randomNumbers.txt";

		Random rand = new Random();

		try {

//			FileWriter fileStream = new FileWriter(filePath,true);
			
			FileWriter fileStream = new FileWriter(filePath);
			BufferedWriter writer = new BufferedWriter(fileStream);

			
			for (int i = 0; i < 10; i++) {
				int number = rand.nextInt(100);
				writer.write(Integer.toString(number));
				writer.newLine();
			}
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println("Възникна грешка при записа на файла");
			System.out.println(e.getMessage());
		}
		
		System.out.print("Записът на файла приключи! \n");
	}

}
