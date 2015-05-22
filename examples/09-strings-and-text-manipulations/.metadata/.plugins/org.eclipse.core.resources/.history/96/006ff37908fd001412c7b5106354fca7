import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.List;


public class FIleDialogs {

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
					FIleDialogs window = new FIleDialogs();
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
			fileChooser.showDialog(null, "Избери");
			
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
			fileChooser.showDialog(null, "Избери");
			
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
	public FIleDialogs() {
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
		
		JButton browseButton = new JButton("\u0418\u0437\u0431\u0435\u0440\u0438");
		browseButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		browseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chooseFile();
			}
		});
		browseButton.setBounds(10, 11, 414, 108);
		frame.getContentPane().add(browseButton);
		
		this.saveBtn = new JButton("\u0417\u0430\u043F\u0438\u0448\u0438");
		saveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveFile();
			}
		});
		saveBtn.setEnabled(false);
		saveBtn.setForeground(Color.MAGENTA);
		saveBtn.setFont(new Font("Tahoma", Font.PLAIN, 46));
		saveBtn.setBounds(10, 130, 414, 120);
		frame.getContentPane().add(saveBtn);
	}
}
