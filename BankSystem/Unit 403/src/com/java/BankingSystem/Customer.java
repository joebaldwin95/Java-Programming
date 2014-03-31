package com.java.BankingSystem;

/**
 * Customer is the class used to create each customer and collect their information.
 * @author Joe Baldwin
 */
public class Customer {
	
	/**
	  * fname contains the first name of the customer.
	  * @author Joe Baldwin 
	  */
	private String fname;
	/**
	  * lname contains the last name of the customer.
	  * @author Joe Baldwin
	  */
	private String lname;
	/**
	  * address1 contains the first line of the address of the customer.
	  * @author Joe Baldwin
	  */
	private String address1;
	/**
	  * address2 contains the second line of the address of the customer.
	  * @author Joe Baldwin
	  */
	private String address2;
	/**
	  * postcode contains the customers postcode.
	  * @author Joe Baldwin
	  */
	private String postcode;
	/**
	  * custref is a unique identifier for the customer.
	  * @author Joe Baldwin
	  */
	private static int custref = 0;
	/**
	  * linkedacc holds the account number of this customers account.
	  * @author Joe Baldwin
	  */
	private int linkedacc;
	 
	  /**
	  * Constructor - Also increments customer ref number.
	  * @author Joe Baldwin
	  */
	public Customer() {
		custref++;
	}
	
	//Getters and Setters
	 /**
	  * Getter for first name
	  * @author Joe Baldwin
	  * 
	  */

	public String getFname() {
		return fname;
	}
	
	 /**
	  * Setter for First Name
	  * @author Joe Baldwin
	  * 
	  */
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	/**
	  * Getter for last name
	  * @author Joe Baldwin
	  * 
	  */
	public String getLname() {
		return lname;
	}
	
	/**
	  * Setter for first name
	  * @author Joe Baldwin
	  * 
	  */
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	/**
	  * Getter for first line of address
	  * @author Joe Baldwin
	  */
	public String getAddress1() {
		return address1;
	}
	
	/**
	  * Setter for first line of address
	  * @author Joe Baldwin
	  * 
	  */
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	/**
	  * Getter for second line of address
	  * @author Joe Baldwin
	  * 
	  */
	public String getAddress2() {
		return address2;
	}
	
	/**
	  * Setter for second line of address
	  * @author Joe Baldwin
	  * 
	  */
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	/**
	  * Getter for postcode
	  * @author Joe Baldwin
	  *
	  */
	public String getPostcode() {
		return postcode;
	}
	
	/**
	  * Setter for postcode
	  * @author Joe Baldwin
	  * 
	  */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	/**
	  * Getter for customer reference number
	  * @author Joe Baldwin
	  * 
	  */
	public int getCustomerref() {
		return custref;
	}
	
	/**
	  * Getter for the account number linked to this customer
	  * @author Joe Baldwin
	  * 
	  */
	public int getLinkedacc() {
		return linkedacc;
	}
	
	/**
	  * Setter for the account number linked to this customer
	  * @author Joe Baldwin
	  * 
	  */
	public void setLinkedacc(int linkedacc) {
		this.linkedacc = linkedacc;
	}
	
	//End Getters and Setters
	
	/**
	  * Display customer details is used to display a customers information in a pre-deteremined format.
	  * @author Joe Baldwin
	  * 
	  */
	public void displayCustomerDetails(){
		StringBuffer fullname = new StringBuffer();//Creates new string buffer
		StringBuffer fulladdress = new StringBuffer();//Creates new string buffer
		fullname.append("Full Name: " + fname + " " + lname);
		fulladdress.append("Full Address: " + address1 + ", " + address2 + ", " + postcode);
		System.out.println(fullname);
		System.out.println(fulladdress);
		System.out.println("Account No: " + linkedacc);
		System.out.println("Customer Ref: " + custref);
	}
	
}
	

