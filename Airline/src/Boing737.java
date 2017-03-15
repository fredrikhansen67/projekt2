import java.util.ArrayList;
import java.util.List;

public class Boing737 extends Aircraft {
	
	private ArrayList<String> seatList = new ArrayList<String>(10);
	
	private String name ;

	public Boing737(String name){
		this.name = name;
		seatList.add("1");
		seatList.add("2");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public void addBooking(Customer cus, int seat){
		//TODO stoppa in i listan
	}
	
	public void removeBooking(){
		//TODO yepp...
	}
	
	public ArrayList<String> getAvailibleSeats(String cabinclass){
		System.out.println("Boing :"+seatList.size());
		return seatList;
	}
	
	

}
