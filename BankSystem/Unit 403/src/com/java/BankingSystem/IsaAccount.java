package com.java.BankingSystem;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * IsaAccount inherits from account to create an account specialised to handle the logic of an ISA Account.
 * @author Joe Baldwin
 * 
 */
public class IsaAccount extends Account {
	
	/**
	 * isacounter counts the amount deposited up to the limit.
	  * @author Joe Baldwin
	  * @see isalimit
	  */
	private static int isacounter = 0;
	
	/**
	  * isalimit sets the limit upto which you can deposit.
	  * @author Joe Baldwin
	  */
	private static int isalimit = 5760;
	
	/**
	  * depamount is the amount you wish to deposit.
	  * @author Joe Baldwin
	  * 
	  */
	private int depamount;
	
	/**
	  * Getter - Displays ISA limit to show the current maximum you can deposit.
	  * @author Joe Baldwin
	  * 
	  */
	public int getIsalimit() {
		return isalimit;
	}
	
	/**
	  * Constructor used inside BankConsole.
	  * @author Joe Baldwin
	  * 
	  */
	public IsaAccount() {
		super();//Ensures superclass is included
	}

	
	/**
	  * isaDep collects the depamount and applys isa logic to it then passes the depamount to the depositMoney method of the superclass.
	  * @author Joe Baldwin
	  */
	@SuppressWarnings("resource")
	public void isaDep(){//Deposit method while applying the logic of an ISA account.
		String carryon = "NO";
		while (carryon.equals("NO")){//Loop ensures the isa limit on deposits can not be exceeded
		int deposit = 0;//Value to be deposited
		Scanner scan = new Scanner(System.in);//Initialise Scanner
		System.out.println("Please Enter An Amount To Deposit In Your ISA Account In Whole Pounds");
		try {
		deposit = scan.nextInt();//Scans user input for next int to passed
		}
		catch (InputMismatchException e) {
			System.out.println("Please Enter An Amount To Deposit In Your ISA Account In Whole Pounds");
		}
		
		
		
		depamount = deposit;//Puts deposit amount into value passed to super method of depositMoney
		int tempcount = isacounter + depamount;//Creates temporary value to count the deposit limit
		if (tempcount > isalimit) {//Checks the isa counter does not exceed the limit
			System.out.println("You have reached you're limit");
			int max = isalimit + depamount;//Evaluates the maximum that can be deposited from the amount previously tried
			int maxdep = max - isalimit;
			System.out.println("The maximum you can deposit is: £" + maxdep);
			
		}
		
		else {
			carryon = "YES";//Breaks loop
			isacounter = isacounter + depamount;//Adds deposit amount to actual isacounter
		}
		}
		int limitcalc = isalimit - isacounter;
		System.out.println("Your ISA Limit Will Be £" + limitcalc);
		super.depositMoney(depamount);//Passes amount to be deposited to super method depositMoney
	}
	
	/**
	  * isaWithdraw asks for the amount the users wants to withdraw then passes it the the withdrawMoney method from the superclass.
	  * @author Joe Baldwin
	  * 
	  */
	@SuppressWarnings("resource")
	public void isaWithdraw(){//Isa withdrawal method
		int withamount;//Amount to withdraw
		Scanner scan = new Scanner(System.in);//Initializes scanner
		System.out.println("Please Enter An Amount To Withdraw From ISA Account In Whole Pounds");
		withamount = scan.nextInt();//Listens for next int from user
		super.withdrawMoney(withamount);//Passes withdrawal amount to super method withdrawMoney
	}

	/**
	  * Getter for isacounter to display how far away from the limit you are.
	  * @author Joe Baldwin
	  * 
	  */
	public static int getIsacounter() {
		return isacounter;//Returns current progress towards isa limit
	}
	
	
	

}
