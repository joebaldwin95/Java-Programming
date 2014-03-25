
public class CustomerTest {
	public static void main (String[] args) {
		
		
		Customer cust1 = new Customer();
		Customer cust2 = new Customer();
		
		//Assigning Values to Member Fields
		
		cust1.customerID = 1;
		cust2.customerID = 2;
		
		cust1.name = "Chay IsTall";
		cust2.name = "Ryans Amess";
		
		cust1.emailAddress = "chay6ft4in@hotmail.com";
		cust2.emailAddress = "Ryanlovestekken@hotmail.co.uk";
		
		cust1.displayCustomerInfo();
		cust2.displayCustomerInfo();
	
		
		
		
		
	}

}
