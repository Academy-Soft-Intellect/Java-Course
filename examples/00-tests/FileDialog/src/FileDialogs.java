import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FileDialogs {
	private static List<String> fileContent;
	
	public static void main(String[] args){
		chooseFile();
		saveFile();
	}

	public static void chooseFile(){
		
		try {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
			fileChooser.showDialog(null, "Choose...");
			
			File file = fileChooser.getSelectedFile();
			
			fileContent = Files.readAllLines(file.toPath());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public static void saveFile(){
		try {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
			fileChooser.showDialog(null, "Choose...");
			
			File file = fileChooser.getSelectedFile();
			
			FileWriter fileStream = new FileWriter(file.getPath());
			BufferedWriter writer = new BufferedWriter(fileStream);

			
			for (String line : fileContent) {
				writer.append(line);
				writer.newLine();
			}
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
