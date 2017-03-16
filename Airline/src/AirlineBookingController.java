import java.util.ArrayList;
import java.util.HashMap;

public class AirlineBookingController implements PricingInterface{
	
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

	}
	
	
	/**
	 * This method will create the booking, set the balance allocate the seat
	 * @param name
	 * @param age
	 * @param phone
	 * @param socialNumber
	 * @param flight
	 * @param cabinclass
	 * @param seat
	 */
	public void addBooking(String name ,int age, String phone , String socialNumber, String flight, String cabinclass, int seat, String food){
		Customer cus = new Customer( name , age,  phone ,  socialNumber);		
		Booking book = new Booking( cus, flight,cabinclass, seat); //lägg in totalpriset
		
		
		for(Aircraft ac:aircraftsList){
			//TODO leta upp flighten och stoppa in i flyglistan på position 'seat'
			if(ac.getName().equals(flight)){
				ac.addBooking(seat, seat);
				System.out.println(ac.toString());
			}
		}
		CompanyBalance = CompanyBalance+calculateTotalPrice(cabinclass, food);
		
	}
	
	public int getBalance(){
		return CompanyBalance;
	}
	
	private int calculateTotalPrice(String cc, String meal){
		int price=0;
		if(cc.equals(CabinClass.FIRST.toString())){
			price+=PricingInterface.FIRST_CLASS_PRICE;
			if(meal!=null)
				price+=PricingInterface.FIRST_CLASS_MEAL;
		}
		else if (cc.equals(CabinClass.ECONOMY.toString())){
			price+=PricingInterface.FIRST_CLASS_PRICE;
			if(meal!=null)
				price+=PricingInterface.ECONOMY_CLASS_MEAL;
		}
					
		return price;
	}
	
	public HashMap<FoodItem, CabinClass> getFoodItemsList(String cabinclass){
		FoodList fl = new FoodList();
		if(cabinclass.contains(CabinClass.FIRST.toString()))
			return fl.getFoodItemsList(CabinClass.FIRST);
		else
			return fl.getFoodItemsList(CabinClass.ECONOMY);
	}
	public ArrayList<String> getSeatFromAircraft(String flight, String cabinclass){
		for(Aircraft ac:aircraftsList){
			if(ac.getName().equals(flight)){
				System.out.println("Flight :"+ac.getName());
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
