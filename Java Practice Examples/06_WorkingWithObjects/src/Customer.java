
public class Customer {
	public int customerID = 0; // Default ID
	public String name = "-name required-";
	public String emailAddress = "-email required-";
	
	//This method displays values for an item
	public void displayCustomerInfo() {
		System.out.println("*****Customer Info*****");
		System.out.println("Customer ID" + customerID);
		System.out.println("Name: " + name);
		System.out.println("Email: " + emailAddress);
		System.out.println("***********************");
		
		
	}//End of display method

}//End of class
