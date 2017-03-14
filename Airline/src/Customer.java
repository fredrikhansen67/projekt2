

public class Customer {

	private static int customerID;         
	private String name;
	private int age;
	private int telephone;
	private int personalNumber;
	private int customerIndex;
	
	
	public Customer(String name, int age, int telephone, int personalNumber) {
		
		this.name =  name;
		this.age = age;
		this.telephone = telephone;
		this.personalNumber = personalNumber;
		customerIndex=customerID++; 
	
	}


	public static int getCustomerID() {
		return customerID;
	}
	
	public int getCustomerIndex() {
		return customerIndex;
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
