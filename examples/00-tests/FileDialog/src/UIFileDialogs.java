import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.List;


public class UIFileDialogs {

	private JFrame frame;
	private JButton saveBtn;
	
	private List<String> fileContent;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIFileDialogs window = new UIFileDialogs();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void chooseFile(){
		
		try {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
			fileChooser.showDialog(null, "Choose...");
			
			File file = fileChooser.getSelectedFile();
			
			this.fileContent = Files.readAllLines(file.toPath());
			
			this.saveBtn.setEnabled(true);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void saveFile(){
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

	/**
	 * Create the application.
	 */
	public UIFileDialogs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton browseButton = new JButton("Load File");
		browseButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		browseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chooseFile();
			}
		});
		browseButton.setBounds(10, 11, 414, 108);
		frame.getContentPane().add(browseButton);
		
		this.saveBtn = new JButton("Save File");
		saveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveFile();
			}
		});
		saveBtn.setEnabled(false);

		saveBtn.setFont(new Font("Tahoma", Font.PLAIN, 26));
		saveBtn.setBounds(10, 130, 414, 108);
		frame.getContentPane().add(saveBtn);
	}
}
