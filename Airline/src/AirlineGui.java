import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AirlineGui extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	String seatPos="";
	
	AirlineBookingController ac = new AirlineBookingController();
	FoodList foodList = new FoodList();
	 ArrayList<String> arrSeat;
	 ArrayList<String> arrFlight;
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
		
		JComboBox<String> comboSeat = new JComboBox<>();
		JComboBox<String> comboFlight = new JComboBox<>();
	    JComboBox<CabinClass> comboCabin = new JComboBox<>();
	    DefaultComboBoxModel modelSeat = (DefaultComboBoxModel) comboSeat.getModel();
	    DefaultComboBoxModel modelFlight = (DefaultComboBoxModel) comboFlight.getModel();

				
		ArrayList<String[]> lblIdandNamesList = new ArrayList<>();
		lblIdandNamesList.add(new String[] {"lblName", "name:"});
		lblIdandNamesList.add(new String[] {"lblAge", "Age:"});
		lblIdandNamesList.add(new String[] {"lblPnumber", "Telephone:"});
		lblIdandNamesList.add(new String[] {"lblSocialNumber", "Social number:"});
		lblIdandNamesList.add(new String[] {"lblFlight", "Flight:"});
		lblIdandNamesList.add(new String[] {"lblCabinclass", "Cabinclass:"});
		lblIdandNamesList.add(new String[] {"lblSeat", "Seat:"});
		lblIdandNamesList.add(new String[] {"lblFood", "Food:"});
		
		
		ArrayList<int[]> lblBoundsList = new ArrayList<>();
		lblBoundsList.add(new int[]{120, 80, 95, 20});
		lblBoundsList.add(new int[]{120, 110, 95, 20});
		lblBoundsList.add(new int[]{120, 140, 95, 20});
		lblBoundsList.add(new int[]{120, 170, 95, 20});
		lblBoundsList.add(new int[]{120, 200, 95, 20});
		lblBoundsList.add(new int[]{120, 230, 95, 20});
		lblBoundsList.add(new int[]{120, 260, 95, 20});
		lblBoundsList.add(new int[]{120, 260, 95, 20});
		
		
		Map<List<String>, List<Integer>> lblBoundsMap = new HashMap<>();
		
		
		for (String[] obj : lblIdandNamesList){
			for (int i = 0; i < obj.length; i++){
				System.out.print(obj[i] + "  ");
			}

			System.out.println(" ");

		}
		
		
		
		for (int[] obj : lblBoundsList){
			for (int i = 0; i < obj.length; i ++){
				System.out.print(obj[i] + " ");
			}
			System.out.println(" ");
		}
		
		
		//Lablar
		JLabel lblName = new JLabel("name:");	
		lblName.setBounds(120, 80, 95, 20);
		panel.add(lblName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(120, 110, 95, 20);
		panel.add(lblAge);
		
		JLabel lblPnumber = new JLabel("Telephone:");
		lblPnumber.setBounds(120, 140, 95, 20);		
		panel.add(lblPnumber);
		
		JLabel lblSocialNumber = new JLabel("Social number:");
        lblSocialNumber.setBounds(120, 170, 95, 20);
        panel.add(lblSocialNumber);
        
        JLabel lblFlight = new JLabel("Flight:");
        lblFlight.setBounds(120, 200, 95, 20);
        panel.add(lblFlight);
        
        JLabel lblCabinclass = new JLabel("Cabinclass:");
        lblCabinclass.setBounds(120, 230, 95, 20);
        panel.add(lblCabinclass);
        
        JLabel lblSeat = new JLabel("Seat:");
        lblSeat.setBounds(120, 260, 95, 20);
        panel.add(lblSeat);
        
        JLabel lblFood = new JLabel("Food:");
        lblFood.setBounds(120, 290, 95, 20);
        panel.add(lblFood);
		
		textField = new JTextField();
		textField.setBounds(233, 80, 96, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(233, 110, 96, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(233, 140, 96, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(panel);
        
        
        
        textField_3 = new JTextField();
        textField_3.setBounds(233, 170, 96, 20);
        panel.add(textField_3);
        textField_3.setColumns(10);
        

        
        
        for(Aircraft ac:AirlineBookingController.aircraftsList){
        	comboFlight.addItem(ac.getName());
        }
        
        comboFlight.setBounds(233, 200, 96, 20);
        panel.add(comboFlight);
        
        
        comboCabin.setBounds(233, 230, 96, 20);
        
        for (CabinClass c : CabinClass.values()){
        	comboCabin.addItem(c);
        }
 
        comboCabin.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		
        		CabinClass c = (CabinClass) comboCabin.getSelectedItem();
        		System.out.println(c);
        		foodList.getFoodItemsList(c);
        	}
        	
        });
        
             
        panel.add(comboCabin);      
        comboSeat.setBounds(233, 260, 96, 20);
       
        
        arrSeat = ac.getSeatFromAircraft(comboFlight.getSelectedItem().toString(), comboCabin.getSelectedItem().toString());
        System.out.println("Arr : "+arrSeat.size());
   
        comboFlight.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				modelSeat.removeAllElements();
				arrSeat = ac.getSeatFromAircraft(comboFlight.getSelectedItem().toString(), comboCabin.getSelectedItem().toString());
				for(String item:arrSeat){
					modelSeat.addElement(item);
				}
				comboSeat.revalidate();			
			
			}
		});
        

        comboSeat.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {

            }
        });

        
        panel.add(comboSeat);
        this.setSize(800, 600);

        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//comboSeat.removeItem(seatPos);
				comboSeat.repaint();
				
				ac.addBooking(
						textField.getText(),
						convertStringtoInt(textField_1.getText()),
						textField_1.getText(),
						textField_3.getText(),
						comboFlight.getSelectedItem().toString(),
						comboCabin.getSelectedItem().toString(),
						convertStringtoInt(comboSeat.getSelectedItem().toString())
						);
				
				modelSeat.removeAllElements();
				arrSeat = ac.getSeatFromAircraft(comboFlight.getSelectedItem().toString(), comboCabin.getSelectedItem().toString());
				for(String item:arrSeat){
					modelSeat.addElement(item);
				}
				comboSeat.revalidate();	

				System.out.println(
//						"Customer name: " + textField.getText()+
//									 "\nage: " + textField_1.getText()+
//								  "\nPhone: " + textField_1.getText()+
//								  "\nSocial number: " + textField_3.getText()+
//				 				 "\nFlight: " + comboFlight.getSelectedItem()+
				 				 "\nCabinclass: " + comboCabin.getSelectedItem()
				 				+ "\nSeat:  " + comboSeat.getSelectedItem()
				 				);
			}
		
		});
        //Display the window.
		
        this.update(this.getGraphics());
        this.setVisible(true);
		
		
	}
	
	public int convertStringtoInt(String str){
		try{
			return Integer.parseInt(str);
		}catch(Exception e){System.out.println("Illegal values in field :" + str+":");return 0;}
		
	}
}
