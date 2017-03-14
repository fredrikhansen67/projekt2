

public class Customer {

	private static int customerID;                // Final på den här ?? 
	private String name;
	private int age;
	private int telephone;
	private int personalNumber;
	
	
	public Customer(String name, int age, int telephone, int personalNumber) {
		
		this.name =  name;
		this.age = age;
		this.telephone = telephone;
		this.personalNumber = personalNumber;
		customerID++; 
	
	}


	public static int getCustomerID() {
		return customerID;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public int getTelephone() {
		return telephone;
	}


	public int getPersonalNumber() {
		return personalNumber;
	}
	
	
	
	
	
}
