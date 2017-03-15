import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.JComboBox;

public class AirlineGui extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
	AirlineBookingController ac = new AirlineBookingController();
	
	public AirlineGui() {
		setLocation(0, -15);
				
		setTitle("Air Crash ");
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Add booking");
		btnNewButton.setBackground(new Color(50, 205, 50));
		
		btnNewButton.setPreferredSize(new Dimension(50,50));
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//Lablar
		JLabel lblName = new JLabel("name:");	
		lblName.setBounds(120, 80, 65, 20);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(120, 110, 65, 20);
		panel.add(lblAge);
		
		JLabel lblPnumber = new JLabel("Telephone:");
		lblPnumber.setBounds(118, 140, 65, 20);		
		
		JLabel lblSocialNumber = new JLabel("Social number");
        lblSocialNumber.setBounds(118, 170, 91, 20);
        panel.add(lblSocialNumber);
        
        JLabel lblFlight = new JLabel("Flight");
        lblFlight.setBounds(118, 200, 65, 20);
        panel.add(lblFlight);
        
        JLabel lblCabinclass = new JLabel("Cabinclass");
        lblCabinclass.setBounds(118, 230, 65, 20);
        panel.add(lblCabinclass);
        
        JLabel lblSeat = new JLabel("Seat");
        lblSeat.setBounds(118, 260, 65, 20);
        panel.add(lblSeat);
        
        JLabel lblNewLabel = new JLabel("Food");
        lblNewLabel.setBounds(118, 290, 65, 20);
        panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(233, 80, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		panel.add(lblName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(233, 110, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		panel.add(lblPnumber);
		
		textField_2 = new JTextField();
		textField_2.setBounds(233, 140, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        
        
        
        textField_3 = new JTextField();
        textField_3.setBounds(233, 170, 86, 20);
        panel.add(textField_3);
        textField_3.setColumns(10);
        

        
        JComboBox comboFlight = new JComboBox();
        for(Aircraft ac:AirlineBookingController.aircraftsList){
        	comboFlight.addItem(ac.getName());
        }
        
        comboFlight.setBounds(233, 200, 86, 20);
        panel.add(comboFlight);
        
        JComboBox comboCabin = new JComboBox();
        comboCabin.setBounds(233, 230, 86, 20);
        panel.add(comboCabin);
        
        JComboBox comboSeat = new JComboBox();
        comboSeat.setBounds(233, 260, 86, 20);
        panel.add(comboSeat);
        this.setSize(800, 600);

        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				System.out.println("Customer name: " + textField.getText()
									+ "\nage: " + textField_1.getText()
								 + "\nPhone: " + textField_2.getText()
								 + "\nSocial number: " + textField_3.getText()
				 				+ "\nFlight: " + comboFlight.getSelectedItem()
				 				+ "\nCabinclass: " + comboCabin.getSelectedItem()
				 				+ "\nSeat:  " + comboSeat.getSelectedItem()
				 				);
			}
		});
        //Display the window.
		
        this.setVisible(true);
		
		
	}
}
