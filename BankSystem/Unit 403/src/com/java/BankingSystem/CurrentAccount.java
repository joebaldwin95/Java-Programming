package com.java.BankingSystem;

import java.util.Scanner;
/**
 * Current Account extends Account to inherit its properties while implementing new methods of its own.
 * @author Joe
 */
public class CurrentAccount extends Account {

	/**
	 * For construction of current account objects
	 * @author Joe Baldwin
	 */
	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Current Account deposit method requests an amount from user and passes it to the deposit method in the superclass
	 * @author Joe Baldwin
	 */
	@SuppressWarnings("resource")
	public void curDep(){
		Scanner scan = new Scanner(System.in);//Initialize Scanner
		System.out.println("How much would you like to deposit?");
		double damount = scan.nextDouble();//Passes users input into double
		super.depositMoney(damount);//Double is passed into super depositMoney method
	}
	
	/**
	 * Current Account withdrawal method requests an amount from user and passes it to the withdrawal method in the superclass
	 * @author Joe Baldwin
	 */
	@SuppressWarnings("resource")
	public void curWithdraw(){
		Scanner scan = new Scanner(System.in);//Initialize Scanner
		System.out.println("How much would you like to withdraw?");
		double wamount = scan.nextDouble();//Passes 
		super.withdrawMoney(wamount);
	}

}
