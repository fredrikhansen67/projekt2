

import java.util.ArrayList;

public class UI implements PricingInterface{
	
	private Customer customer;
	private double customerTravelCost;
	private double TotalCompanyIncome;
	
	public void printCustomerCosts(Customer customer, ArrayList<Booking> bookings){
		// Prints costs for customer (food + ticket)
		for (Booking bok :  bookings ){
			if (bok.getCus() == customer ){
				double seatPrice;
				double foodPrice;
				if (bok.getCabinclass() == CabinClass.FIRST){
					seatPrice = FIRST_CLASS_PRICE;
				}
				else {
					seatPrice = ECONOMY_CLASS_PRICE;
				}
				
				
				customerTravelCost = seatPrice + foodPrice;
				System.out.println("customerTravelCost : " + customerTravelCost);
			}
		}
	}
	
	public double printTotalCompanyIncome(ArrayList<Booking> bookings){
		// Prints income from all customers
		
		for (Booking bok :  bookings ){
			customerTravelCost = bok.getSeatNumberPrice() + bok.getFoodItemPrice();
			TotalCompanyIncome = TotalCompanyIncome + customerTravelCost; 
			System.out.println("TotalCompanyIncome : " + TotalCompanyIncome);
		}
		return TotalCompanyIncome;
	}
	
	public void printCompanyProfit(ArrayList<Booking> bookings){
		// 0.3 * TotalCompanyIncome
		printTotalCompanyIncome(bookings);
		System.out.println("CompanyProfit " + printTotalCompanyIncome(bookings) * 0.3);
	}
	
	public void printCustomerDetails(Customer customer){
		
		System.out.println("Customer name: " + customer.getName()
						+ "\nCustomerID: " + customer.getCustomerID());
	
	}

	
		
}

