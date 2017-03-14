import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AirlineGui extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public AirlineGui() {
		setTitle("Air Crash");
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Add booking");
		btnNewButton.setPreferredSize(new Dimension(50,50));
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		JLabel lblName = new JLabel("Name:");	
		JLabel lblPnumber = new JLabel("Social id number:");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		lblPnumber.setVerticalAlignment(3);
		JLabel lblAge = new JLabel("age:");
		panel.add(lblAge);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		panel.add(lblName);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		panel.add(lblPnumber);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
	}

}
