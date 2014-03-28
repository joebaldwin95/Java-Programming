package com.java.BankingSystem;

import java.util.Scanner;

public class Account {
	
	private double balance = 0.00; //Account balance variable
	private static int accno = 0; //Account number variable
	
	
	//ENCAP
	//Allows you to retrieve the account number of the constructed account.
	public int getAccno() {
		return accno;
	}
	
	//Allows you to set an account number although this should not be necessary.
	public void setAccno(int accno) {
		Account.accno = accno;
	}
	
	//Account Constructor - Also increments account number to ensure a unique number.
	public Account() {
		accno++;
	}
	
	//Main Method
	public static void main(String[] args) {
	
		
	}
	//Allows you to retrieve the balance that has been set.
	public double getBalance() {
		return balance;
		
	}
	
	//Allows deposits without going through yes/no checks
	public void forceDeposit(double dep){
		balance = balance + dep;
	}
	
	
	//Allows the deposit of money into the account and prints the final balance.
	@SuppressWarnings("resource")
	public void depositMoney(double damount){
		double depositamount = 0; //Amount to deposit into account variable
		Scanner scan = new Scanner(System.in); //Initialize scanner for keyboard input
		depositamount = damount; //Retrieve amount from method parameter into local variable
		double tempbalance = balance + depositamount; //Temporary balance to display
		System.out.println("Are you sure you wish to deposit " + "£" + depositamount + " Your New Balance Would Be " + "£" + tempbalance);
		System.out.println("Please enter 'Yes' or 'No'");//Provides Response Hint
		String sure = scan.nextLine();//Checks for keyboard input and passes input to String "sure"
		if (sure.equals("Yes")) { //Performs deposit if sure returns "Yes"
			balance = balance + depositamount;//Actual deposit
			System.out.println("----DEPOSITING----");
			System.out.println("SUCCESS!!!");
			System.out.println("Your New Balance Is " + "£" + balance);
		}
		
		else {//Cancels deposit if sure returns "No"
			System.out.println("You Have Made No Deposit");
			System.out.println("Your Balance Is Still " + "£" + balance);
		}
		
	}
	
	//Allows the withdrawal of money from an account.
	@SuppressWarnings("resource")
	public void withdrawMoney(double wamount){
		double withdrawamount; //Amount to withdraw from account variable
		Scanner scan = new Scanner(System.in);
		withdrawamount = wamount;//Passes wamount variable to withdrawamount which is used in calculations.
		double tempbalance = balance - withdrawamount;
		System.out.println("Are you sure you wish to withdraw " + "£" + withdrawamount + " Your New Balance Would Be " + "£" + tempbalance);
		System.out.println("Please enter 'Yes' or 'No'");
		String sure = scan.nextLine();//Passes user input to "sure" to be used in decision making
		if (sure.equals("Yes")) {//Checks whether the user wants to deposit
			balance = balance - withdrawamount;//Performs the withdrawal
			System.out.println("----WITHDRAWING----");
			System.out.println("SUCCESS!!!");
			System.out.println("Your New Balance Is " + "£" + balance);
		}
		
		else {//No withdrawal will be made
			System.out.println("You Have Made No Withdrawal");
			System.out.println("Your Balance Is Still " + "£" + balance);
		}
		
	}

	

}
