

public class Customer {

	private static int customerID;         
	private String name;
	private int age;
	private int telephone;
	private int socialNumber;
	private int customerIndex;
	
	
	public Customer(String name, int age, int telephone, int socialNumber) {
		
		this.name =  name;
		this.age = age;
		this.telephone = telephone;
		this.socialNumber = socialNumber;
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


	public int getSocialNumber() {
		return socialNumber;
	}
	
	
	
	
	
}
