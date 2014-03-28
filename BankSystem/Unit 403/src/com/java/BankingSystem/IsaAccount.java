package com.java.BankingSystem;

import java.util.Scanner;

public class IsaAccount extends Account {
	
	private static double isacounter = 0;
	private double isalimit = 5760;
	private double depamount;
	
	//Displays ISA limit to show the current maximum you can deposit
	public double getIsalimit() {
		return isalimit;
	}

	//Constructor
	public IsaAccount() {
		super();//Ensures superclass is included
	}

	
	
	@SuppressWarnings("resource")
	public void isaDep(){//Deposit method while applying the logic of an ISA account.
		String carryon = "NO";
		while (carryon.equals("NO")){//Loop ensures the isa limit on deposits can not be exceeded
		double deposit = 0;//Value to be deposited
		Scanner scan = new Scanner(System.in);//Initialise Scanner
		System.out.println("Please Enter An Amount To Deposit In Your ISA Account");
		deposit = scan.nextDouble();//Scans user input for next double to passed
		depamount = deposit;//Puts deposit amount into value passed to super method of depositMoney
		double tempcounter = isacounter;//Creates temporary value to count the deposit limit
		if (tempcounter >= isalimit) {//Checks the isa counter does not exceed the limit
			System.out.println("You have reached you're limit");
			double max = tempcounter - isalimit;//Evaluates the maximum that can be deposited from the amount previously tried
			System.out.println("The maximum you can deposit is: £" + max);
			
		}
		
		else {
			carryon = "YES";//Breaks loop
			isacounter = isacounter + depamount;//Adds deposit amount to actual isacounter
		}
		}
		System.out.println("Your ISA Limit Will Be" + isacounter);
		super.depositMoney(depamount);//Passes amount to be deposited to super method depositMoney
	}
	
	@SuppressWarnings("resource")
	public void isaWithdraw(){//Isa withdrawal method
		double withamount;//Amount to withdraw
		Scanner scan = new Scanner(System.in);//Initializes scanner
		System.out.println("Please Enter An Amount To Withdraw From ISA Account");
		withamount = scan.nextDouble();//Listens for next double from user
		System.out.println("Your ISA Limit Will Be");
		super.withdrawMoney(withamount);//Passes withdrawal amount to super method withdrawMoney
	}


	public static double getIsacounter() {
		return isacounter;//Returns current progress towards isa limit
	}
	
	
	

}
