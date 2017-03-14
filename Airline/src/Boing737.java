import java.util.ArrayList;
import java.util.List;

public class Boing737 extends Aircraft {
	
	List<Customer> seatList = new ArrayList<Customer>();
	
	private String name ;

	public Boing737(String name){
		this.name = name;
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
	
	

}
