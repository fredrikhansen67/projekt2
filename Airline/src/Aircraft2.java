import java.util.ArrayList;

public abstract class Aircraft2 {


	private String flightId;
	private String modelId;
	private int seatNr;
	private boolean occupied;
	private boolean food;
	private double price;
	private CabinClass seatClass;
	private int nrOfSeats;
	public boolean[] seats;
    
	public Aircraft2(String flightId, String modelId, int nrOfSeats, int seatNr, boolean occupied, boolean food, double price, CabinClass seatClass) {
				
		this.nrOfSeats = nrOfSeats;
		this.seatNr = seatNr;
		this.occupied = occupied;
		this.food = food;
		this.price = price;
		this.seatClass = seatClass;
    	seats = new boolean[nrOfSeats];
    	
    }

	public String getFlightId() {
		return flightId;
	}

	
	public String getModelId() {
		return modelId;
	}

	
	
	

	
	
}
