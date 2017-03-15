import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Boing737 extends Aircraft {
	
	private ArrayList<String> seatList;
	
	private String name ;
	private int numberOfSeats=10;
	
	public Boing737(String name){
		seatList = new ArrayList<String>(numberOfSeats);
		this.name = name;
		initiateSeatList();
	}
	
	private void initiateSeatList(){
		for(int i=1;i<numberOfSeats+1;i++){
			seatList.add(""+i);
		}
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public void addBooking(int index, int seat){
		seatList.set(index, ""+0);
	}
	
	public void removeBooking(int index){
		//TODO yepp...
		seatList.set(index, ""+0);
	}
	
	public ArrayList<String> getAvailibleSeats(String cabinclass){
		ArrayList temp = new ArrayList();
		for(String i:seatList){
			if(!i.trim().equals("0"))
				temp.add(i);
		}
		System.out.println("Boing :"+seatList.size());
		return temp;
	}
	
	

}
