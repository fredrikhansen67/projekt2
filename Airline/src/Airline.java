
public class Airline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirlineBookingController ac = new AirlineBookingController();

		ac.initSystem();
		
		
		System.out.println(ac);
		

	       javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	AirlineGui aGui = new AirlineGui();
	            }
	        });
		
		

	
			ac.initSystem();
			AirlineGui gui = new AirlineGui();
			
			System.out.println(ac.toString());
		
	}
	
	


	

}
