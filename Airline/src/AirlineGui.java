import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.TextArea;

public class AirlineGui extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
	AirlineBookingController ac = new AirlineBookingController();
	
	public AirlineGui() {
				
		setTitle("Air Crash ");
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Add booking");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				System.out.println("Customer name: " + textField.getText()
									+ "\nage: " + textField_1.getText()
								 + "\nPhone: " + textField_2.getText()
								 + "\nSocial number: " + textField_3.getText());
			}
		});
		btnNewButton.setPreferredSize(new Dimension(50,50));
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		JLabel lblName = new JLabel("age:");	
		JLabel lblPnumber = new JLabel("Telephone:");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		lblPnumber.setVerticalAlignment(3);
		JLabel lblAge = new JLabel("Name:");
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
		
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        
        JLabel lblSocialNumber = new JLabel("Social number");
        panel.add(lblSocialNumber);
        
        textField_3 = new JTextField();
        panel.add(textField_3);
        textField_3.setColumns(10);
        
        TextArea textArea = new TextArea();
        panel.add(textArea);
        this.setSize(800, 600);

        //Display the window.
		
        this.setVisible(true);
		
		
	}

}
