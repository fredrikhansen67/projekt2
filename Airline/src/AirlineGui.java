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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class AirlineGui extends JFrame {
	private JTextField textField = null;
	private JTextField textField_1=null;
	private JTextField textField_2=null;
	private JTextField textField_3=null;
	String seatPos="";
	String bookField=null;
	
	AirlineBookingController ac = new AirlineBookingController();
//	FoodList foodList = new FoodList();
	public static Map<String, JComponent> objs = new HashMap<String,JComponent>();
	
	public JComponent createLabel(String s1, int x, int y, int w, int h){
		
		JLabel lbl = new JLabel(s1);	
		lbl.setBounds(x, y, w, h);
	    return lbl;
	}
	
	
	 ArrayList<String> arrSeat;
	 ArrayList<String> arrFlight;
	 HashMap<FoodItem,CabinClass>arrFood;
	 
	public AirlineGui() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AirlineGui.class.getResource("/resourses/plane.png")));
		setLocation(0, -15);
				
		setTitle("Air Crash ");
		
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Add booking");
		btnNewButton.setBackground(new Color(50, 205, 50));
		//Add booking button
		btnNewButton.setPreferredSize(new Dimension(50,50));
		getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		//Booking info textfield
		JTextField bookingInfo = new JTextField();
		JScrollPane scrollBook = new JScrollPane(bookingInfo);
		bookingInfo.setEditable(false);
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(Color.LIGHT_GRAY);
		panelNorth.add(scrollBook);
		bookingInfo.setPreferredSize(new Dimension(600,50));
		getContentPane().add(panelNorth, BorderLayout.NORTH);
		
		
		JPanel panelEast = new JPanel();
		JLabel balanceLabel = new JLabel("Balance");
		panelEast.add(balanceLabel);
		JTextField balanceInfo = new JTextField();
		balanceInfo.setBackground(Color.LIGHT_GRAY);
		balanceInfo.setText("0");
		panelEast.add(balanceInfo);
		panelEast.setBackground(Color.LIGHT_GRAY);
		balanceInfo.setPreferredSize(new Dimension(50,20));
		balanceInfo.setEditable(false);
		getContentPane().add(panelEast, BorderLayout.EAST);
		
		JComboBox<String> comboSeat = new JComboBox<>();
		JComboBox<String> comboFlight = new JComboBox<>();
	    JComboBox<CabinClass> comboCabin = new JComboBox<>();
	    JComboBox<String> comboFood = new JComboBox<>();
	    DefaultComboBoxModel modelSeat = (DefaultComboBoxModel) comboSeat.getModel();
	    DefaultComboBoxModel<String> modelFlight = (DefaultComboBoxModel) comboFlight.getModel();
	    DefaultComboBoxModel<String> modelFood = (DefaultComboBoxModel) comboFood.getModel();
				
		
		
		objs.put("lblName", createLabel("name:", 120, 80, 95, 20));
		objs.put("lblAge", createLabel("Age:", 120, 110, 95, 20));
		objs.put("lblPnumber", createLabel("Pnumber:", 120, 140, 95, 20));
		objs.put("lblSocialNumber", createLabel("Social number:", 120, 170, 95, 20));
		objs.put("lblFlight", createLabel("Flight:", 120, 200, 95, 20));
		objs.put("lblCabinclass", createLabel("cabinclass:", 120, 230, 95, 20));
		objs.put("lblSeat", createLabel("Seat:", 120, 260, 95, 20));
		objs.put("lblFood", createLabel("Food:", 120, 290, 95, 20));
		
		
		Iterator iter = objs.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, JComponent> thisEntry = (Entry) iter.next();
			Object key = thisEntry.getKey();
			JLabel value = (JLabel)thisEntry.getValue();
			
			panel.add(value);
		}
			
		
		
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
        	modelFlight.addElement(ac.getName());
        }
        
        comboFlight.setBounds(233, 200, 96, 20);
        panel.add(comboFlight);
        
        
        comboCabin.setBounds(233, 230, 96, 20);
        
        for (CabinClass c : CabinClass.values()){
        	comboCabin.addItem(c);
        }
 
        comboCabin.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0){
        		modelSeat.removeAllElements();
        		modelFood.removeAllElements();
				arrSeat = ac.getSeatFromAircraft(comboFlight.getSelectedItem().toString(), comboCabin.getSelectedItem().toString());
				for(String item:arrSeat){
					modelSeat.addElement(item);
					
				}
				arrFood = ac.getFoodItemsList(comboCabin.getSelectedItem().toString());
				Iterator iter = arrFood.entrySet().iterator();
				modelFood.addElement(null);
				while(iter.hasNext()){
					modelFood.addElement(iter.next().toString());
				}
				comboFood.revalidate();	
   
				
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
        
//        JComboBox comboFood = new JComboBox();
        
        comboFood.setBounds(233, 291, 341, 20);
        panel.add(comboFood);
        this.setSize(800, 600);

        
        
        
        
        
        
        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//comboSeat.removeItem(seatPos);
				comboSeat.repaint();
				//Check all fields all filled in
				if(comboSeat.getSelectedItem()!=null && comboFood.getSelectedItem()!=null && !textField.getText().isEmpty() && !textField_1.getText().isEmpty() && !textField_2.getText().isEmpty() && !textField_3.getText().isEmpty()){
				int seatNr = convertStringtoInt(comboSeat.getSelectedItem().toString());
				
				ac.addBooking(
						textField.getText(),
						convertStringtoInt(textField_1.getText()),
						textField_1.getText(),
						textField_3.getText(),
						comboFlight.getSelectedItem().toString(),
						comboCabin.getSelectedItem().toString(),
						convertStringtoInt(comboSeat.getSelectedItem().toString()),
						comboFood.getSelectedItem().toString()
						);
				}
				else
					errorMessage();
				modelSeat.removeAllElements();
				arrSeat = ac.getSeatFromAircraft(comboFlight.getSelectedItem().toString(), comboCabin.getSelectedItem().toString());
				for(String item:arrSeat){
					modelSeat.addElement(item);
				}
				comboFlight.setSelectedIndex(0);
				comboCabin.setSelectedIndex(0);
				comboSeat.revalidate();	
				balanceInfo.setText(""+ac.getBalance());
				
				//Adding info to upper bar
				bookField = ("\n"+bookField+textField.getText()+" "+
						convertStringtoInt(textField_1.getText())+
						textField_1.getText()+
						textField_3.getText()+
						comboFlight.getSelectedItem().toString()+
						comboCabin.getSelectedItem().toString()+
						convertStringtoInt(comboSeat.getSelectedItem().toString())
						);
				
				bookingInfo.setText(bookField);
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
	
	public void errorMessage(){
		JOptionPane.showMessageDialog(null, "Not sufficient information");
	}
	
	public int convertStringtoInt(String str){
		
		try{
			return Integer.parseInt(str);
		}catch(NumberFormatException e){System.out.println("Illegal values in field :" + str+":");return 0;}
		
	}
}
