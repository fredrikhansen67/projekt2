import java.util.ArrayList;

public abstract class Aircraft {
	
	
	public abstract String getName();

	public abstract void setName(String name);
	public abstract ArrayList getAvailibleSeats(String cabinclass);
	public abstract void addBooking(int index, int seat);
	
}
