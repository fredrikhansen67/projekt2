import java.util.ArrayList;

public class AirlineBookingController {
	
	public static int CompanyBalance = 0;
	
	//TODO Skapa flygplan, skapa Customer, hantera uppdateringar.....
	
	
	// public static ArrayList<AirlineBookingController> bookingList = new ArrayList();
	public static ArrayList<Aircraft> aircraftsList = new ArrayList<Aircraft>();
	// public static ArrayList<Customer> customerList = new ArrayLsit();
	
	
	// Customer c = new Customer("","","","","");
	//Boing737 flyg1 = new Boing737();
	//flyg.addBooking(c, seatPosition);
	
	public void initSystem(){
		//Skapa alla flygplan.
		Aircraft flyg1 = new Boing737();
		Aircraft flyg2 = new Boing737();
		Aircraft flyg3 = new Boing737();
		Aircraft flyg4 = new Boing737();
		Aircraft flyg5 = new Boing737();
		aircraftsList.add(flyg1);
		aircraftsList.add(flyg2);
		aircraftsList.add(flyg3);
		aircraftsList.add(flyg4);
		aircraftsList.add(flyg5);
		Customer cus1 = new Customer("Kalle",22,33,44);
		Customer cus2 = new Customer("frasse",22,33,44);
		Customer cus3 = new Customer("pelle",22,33,44);
	}
	
	public void addBooking(){
		
	}
	
	@Override
	public String toString(){
		String str="";
		for(Aircraft ac:aircraftsList){
			str = "\n"+str+" "+ac.getName();
		}
		return str;
	}

}