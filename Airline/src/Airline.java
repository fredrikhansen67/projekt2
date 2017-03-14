
public class Airline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirlineBookingController ac = new AirlineBookingController();
	
			ac.initSystem();
			AirlineGui gui = new AirlineGui();
			
			System.out.println(ac.toString());
		
	}

}
