import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

public class CreateNewItem extends JDialog {
	
	private Item mainItem;
	
	public Item getItem(){
		return this.mainItem;
	}

	/**
	 * Create the dialog.
	 */
	public CreateNewItem() {
		setTitle("CREATE NEW ITEM");
		setBounds(100, 100, 450, 434);
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(38, 49, 82, 33);
		getContentPane().add(lblName);
		
		JLabel lblBarcode = new JLabel("Barcode:");
		lblBarcode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBarcode.setBounds(38, 105, 82, 33);
		getContentPane().add(lblBarcode);
		
		JLabel lblPrice = new JLabel("Price:");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrice.setBounds(38, 165, 82, 33);
		getContentPane().add(lblPrice);
		
		JLabel lblCount = new JLabel("Count:");
		lblCount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCount.setBounds(38, 223, 82, 33);
		getContentPane().add(lblCount);
		
		JFormattedTextField formattedNameTextField = new JFormattedTextField();
		formattedNameTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		formattedNameTextField.setBounds(138, 51, 214, 33);
		getContentPane().add(formattedNameTextField);
		
		JFormattedTextField formattedBarcodeTextField = new JFormattedTextField("{0,number,#}");
		formattedBarcodeTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		formattedBarcodeTextField.setBounds(138, 107, 214, 33);
		formattedBarcodeTextField.setValue(new Long(0L));
		getContentPane().add(formattedBarcodeTextField);
		
		JFormattedTextField formattedPriceTextField = new JFormattedTextField();
		formattedPriceTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		formattedPriceTextField.setBounds(138, 167, 214, 33);
		formattedPriceTextField.setValue(new Double(0d));
		getContentPane().add(formattedPriceTextField);
		
		JFormattedTextField formattedCountTextField = new JFormattedTextField();
		formattedCountTextField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		formattedCountTextField.setBounds(138, 225, 214, 33);
		formattedCountTextField.setValue(new Integer(0));
		getContentPane().add(formattedCountTextField);
		
		JButton btnCreateNewItem = new JButton("Create New Item");
		btnCreateNewItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mainItem = new Item();
				
				NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
				
				String name = formattedNameTextField.getText();
				long barcode = 0;
				double price = 0;
				int count = 0;
				try {
					barcode = numberFormat.parse(formattedBarcodeTextField.getText()).longValue();
					price = numberFormat.parse(formattedPriceTextField.getText()).doubleValue();
					count = numberFormat.parse(formattedCountTextField.getText()).intValue();
				} catch (ParseException ex) {
					JOptionPane.showMessageDialog(null, "Error parsing!");

				}

				if (formattedNameTextField.getText() == null || 
						formattedNameTextField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter a name!");

					
				} else if (formattedBarcodeTextField.getText() == null || 
						formattedBarcodeTextField.getText().equals("") ||
						barcode <= 0) {
							JOptionPane.showMessageDialog(null, "Please enter a barcode greater than 0!");	
				} else if (formattedPriceTextField.getText() == null || 
						formattedPriceTextField.getText().equals("") ||
						price < 0)
						 {
					JOptionPane.showMessageDialog(null, "Please enter a valid and positive price!");
					
				} else if (formattedCountTextField.getText() == null || 
						formattedCountTextField.getText().equals("") ||
						count < 0) {
					JOptionPane.showMessageDialog(null, "Please enter a count greater than 0!");
					
				} else {
					mainItem.setName(name);
					mainItem.setBarcode(barcode);
					mainItem.setPrice(price);
					mainItem.setCount(count);
					setVisible(false);
				}
			}
		});
		btnCreateNewItem.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCreateNewItem.setBounds(10, 351, 177, 33);
		getContentPane().add(btnCreateNewItem);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBounds(227, 351, 177, 33);
		getContentPane().add(btnCancel);
		

		


	}
}
