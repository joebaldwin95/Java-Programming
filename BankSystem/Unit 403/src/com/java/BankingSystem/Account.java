package com.java.BankingSystem;

import java.util.Scanner;

/**
 * Basic account class to be extended by specialised accounts.
 * @author Joe Baldwin
 * 
 */
public class Account {
	
	/**
	  *Balance holds the current balance figure for the account.
	  * @author Joe Baldwin
	  *
	  */
	private int balance = 0; //Account balance variable
	
	/**
	 * Account number to be the unique identifier for the account - is incremented by the constructor.
	  * @author Joe Baldwin
	  * 
	  */
	private static int accno = 0; //Account number variable
	
	
	/**
	  * Allows you to retrieve the account number of the constructed account.
	  * @author Joe Baldwin
	  */
	public int getAccno() {
		return accno;
	}
	
	/**
	  * Allows you to set an account number although this should not be necessary.
	  * @author Joe Baldwin
	  */
	public void setAccno(int accno) {
		Account.accno = accno;
	}
	
	/**
	  * Account Constructor - Also increments account number to ensure a unique number.
	  * @author Joe Baldwin
	  */
	public Account() {
		accno++;
	}
	
	/**
	  * Allows you to retrieve the balance that has been set.
	  * @author Joe Baldwin
	  */
	public int getBalance() {
		return balance;
		
	}
	
	/**
	  * Allows deposits without going through yes/no checks
	  * @author Joe Baldwin
	  */
	public void forceDeposit(int dep){
		balance = balance + dep;
	}
	
	/**
	  * Allows the deposit of money into the account and prints the final balance.
	  * @author Joe Baldwin
	  */
	@SuppressWarnings("resource")
	public void depositMoney(int damount){
		int depositamount = 0; //Amount to deposit into account variable
		Scanner scan = new Scanner(System.in); //Initialize scanner for keyboard input
		depositamount = damount; //Retrieve amount from method parameter into local variable
		int tempbalance = balance + depositamount; //Temporary balance to display
		System.out.println("Are you sure you wish to deposit " + "£" + depositamount + " ?" + " -- Your New Balance Would Be " + "£" + tempbalance);
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
	
	/**
	  * Allows the withdrawal of money from an account.
	  * @author Joe Baldwin
	  */
	@SuppressWarnings("resource")
	public void withdrawMoney(int wamount){
		int withdrawamount; //Amount to withdraw from account variable
		Scanner scan = new Scanner(System.in);
		withdrawamount = wamount;//Passes wamount variable to withdrawamount which is used in calculations.
		int tempbalance = balance - withdrawamount;
		System.out.println("Are you sure you wish to withdraw " + "£" + withdrawamount + "? " + " -- Your New Balance Would Be " + "£" + tempbalance);
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
