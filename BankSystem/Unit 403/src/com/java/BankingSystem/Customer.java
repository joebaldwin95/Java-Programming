package com.java.BankingSystem;

public class Customer {
	
	private String fname;
	private String lname;
	private String address1;
	private String address2;
	private String postcode;
	private static int custref = 0;
	private int linkedacc;
	
	//Constructor
	public Customer() {
		custref++;
	}
	
	//Getters and Setters
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	

	public String getPostcode() {
		return postcode;
	}
	

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	

	public int getCustomerref() {
		return custref;
	}
	

	public int getLinkedacc() {
		return linkedacc;
	}

	public void setLinkedacc(int linkedacc) {
		this.linkedacc = linkedacc;
	}
	
	//End Getters and Setters
	
	//Displays Customer Details Once Set
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
	

