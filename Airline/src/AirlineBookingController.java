import java.util.ArrayList;

public class AirlineBookingController {
	
	public static int CompanyBalance = 0;
	
	//TODO Skapa flygplan, skapa Customer, hantera uppdateringar.....
	
	
	public static ArrayList<AirlineBookingController> bookingList = new ArrayList();
	public static ArrayList<Aircraft> aircraftsList = new ArrayList<Aircraft>();
	public static ArrayList<Customer> customerList = new ArrayList<Customer>();
	public static ArrayList<String> cabinClass = new ArrayList<>();
	
	
	// Customer c = new Customer("","","","","");
	//Boing737 flyg1 = new Boing737();
	//flyg.addBooking(c, seatPosition);
	
	public void initSystem(){
		//Skapa alla flygplan.
		Aircraft flyg1 = new Boing737("sk121");
		Aircraft flyg2 = new Boing737("sk122");
		Aircraft flyg3 = new Boing737("sk123");
		Aircraft flyg4 = new Boing737("sk124");
		Aircraft flyg5 = new Boing737("sk125");
		aircraftsList.add(flyg1);
		aircraftsList.add(flyg2);
		aircraftsList.add(flyg3);
		aircraftsList.add(flyg4);
		aircraftsList.add(flyg5);
		Customer cus1 = new Customer("Kalle",22,"33","44");
		Customer cus2 = new Customer("frasse",22,"33","44");
		Customer cus3 = new Customer("pelle",22,"33","44");
	}
	
	public void addBooking(String name ,int age, String phone , String socialNumber, String flight, String cabinclass, int seat){
		Customer cus = new Customer( name , age,  phone ,  socialNumber);
		
		
		Booking book = new Booking( cus, flight,cabinclass, seat);
		
		for(Aircraft ac:aircraftsList){
			//TODO leta upp flighten och stoppa in i flyglistan på position 'seat'
		}
		
	}
	
	public ArrayList<String> getSeatFromAircraft(String flight, String cabinclass){
		for(Aircraft ac:aircraftsList){
			if(ac.getName().equals(flight)){
				System.out.println("MATCH "+ac.getName());
				return ac.getAvailibleSeats(cabinclass);
			}
		}
		return null;
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
