package com.java.BankingSystem;

import java.util.Scanner;

/**
 * BankConsole is the class a user will interact with, this creates and calls all accounts, customers and their respective methods.
 * @author Joe Baldwin
 */
public class BankConsole {
	
	/**
	  * The main method contains all the code for this class, See commments for more info. 
	  * @author Joe Baldwin
	  */
	public static void main(String[] args) {
		//INITIALIZATION START - INITIALIZE SCANNER AND CREATES FIRST CUSTOMER OBJECT
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Customer customer = new Customer();
		//INITIALIZATION END
		
		
		//INTRO START - PROVIDES WELCOME TO THE PROGRAM
		System.out.println("Welcome to the Very National Bank - Account and Customer Creation Wizard");
		System.out.println("---------------------------------");
		//INTRO END
		
		
		//CUSTOMER CREATION START - TAKES CUSTOMER INFO AND SETS IT INSIDE THE CUSTOMER OBJECTS
		System.out.println("First we will need some basic details to get going...");
		
		//NAME INPUT START - TAKES USERS FIRST AND LAST NAME AND SETS THEM INSIDE THE CUSTOMER OBJECT
		int i = 0;
		while (i < 2){
		System.out.println("What is your First Name?");
		String fname = scan.nextLine();
		if (fname.matches("[a-zA-Z]+")){
			customer.setFname(fname);
			i++;
			}
		else {
			 System.out.println("Please Only Enter Letters - No Numbers or Special Characters");
			 }
		System.out.println("What is your Last Name?");
		String lname = scan.nextLine();
		if (lname.matches("[a-zA-Z]+")){
			i++;
			customer.setLname(lname);
			}
		else {
			 System.out.println("Please Only Enter Letters - No Numbers or Special Characters");
			 }
		
		//NAME INPUT END
		
		}
		
		//ADDRESS INPUT START - TAKES USERS ADDRESS AND SETS ADDRESS1 AND ADDRESS2 INSIDE CUSTOMER OBJECT
		System.out.println("What is the first line of you're address?");
		String addressfirst = scan.nextLine();
		customer.setAddress1(addressfirst);
		System.out.println("What is the second line of you're address?");
		String addresssecond = scan.nextLine();
		customer.setAddress2(addresssecond);
		System.out.println("What is you're postcode?");
		String postcode = new String();
		postcode = scan.nextLine();
		//ADDRESS INPUT END
		
		//START POSTCODE CLEANUP - ENSURES UPPERCASE IS USED + SETS POSTCODE INSIDE CUSTOMER OBJECT
		String postcodeupper = postcode.toUpperCase();
		customer.setPostcode(postcodeupper);
		//END POSTCODE CLEANUP
		
		//START FULL ADDRESS CREATION - DISPLAYS FULL ADDRESS TO USER
		StringBuffer fulladdress = new StringBuffer();
		fulladdress.append("You're address is: " + addressfirst + ", " + addresssecond + ", " + postcodeupper);
		System.out.println(fulladdress);
		//END FULL ADDRESS CREATION
		
		
		System.out.println("Thank you! - We will now move onto account creation!");
		//CUSTOMER CREATION END
		
		
		//ACCOUNT CREATION START
		System.out.println("What Type Of Account Would You Like To Open? - ISA or Current");
		
		//QUERY ACCOUNT TYPE START - DETERMINES WHAT TYPE OF ACCOUNT A USER WANTS TO OPEN
		String accounttypelower = new String();
		accounttypelower = scan.nextLine();
		String accounttype = accounttypelower.toUpperCase();
		//QUERY ACCOUNT TYPE END
		
		//ISA ACCOUNT CREATION START - IF USER REQUESTS "ISA", ISA ACCOUNT IS CREATED
		if (accounttype.equals("ISA")){
			
			//ACCOUNT OPENING START
			IsaAccount isaaccount = new IsaAccount();//CREATES ISA ACCOUNT OBJECT THAT INHERITS FROM ACCOUNT
			customer.setLinkedacc(isaaccount.getAccno());//SETS THE ACCOUNT NUMBER INSIDE CUSTOMER OBJECT
			System.out.println("You have opened an ISA Account");
			System.out.println("Your Current Balance: £" + isaaccount.getBalance());
			System.out.println("This tax year allows you to deposit and withdraw a total of £" + isaaccount.getIsalimit() + " combined.");
			//ACCOUNT OPENING END
			
			//ISA USER MENU START
			String choice = null;
			while (choice != "EXIT"){//CREATES USER MENU ONCE ACCOUNT HAS BEEN CREATED
			System.out.println(" ---------------------------ACCOUNT ADMIN-----------------------------");
			System.out.println("| Deposits - To deposit into you're ISA type, 'DEPOSIT'               |");
			System.out.println("| Withdrawals - To withdraw from you're ISA type, 'WITHDRAW'          |");
			System.out.println("| Customer Details - To view you're customer details type, 'DETAILS'  |");
			System.out.println("| Exit - To exit the program type, 'EXIT'                             |");
			System.out.println("| Current Balance - £" + isaaccount.getBalance() +"                                                |");//DISPLAYS BALANCE
			System.out.println(" --------------------------------------------------------------------- ");
			choice = scan.nextLine();
			
				switch (choice){//WAITS FOR RESPONSES
				case "DEPOSIT":
					isaaccount.isaDep();//CALLS THE DEPOSIT METHOD INSIDE ISA ACCOUNT
					break;
				case "WITHDRAW":
					isaaccount.isaWithdraw();//CALLS THE WITHDRAW METHOD INSIDE ISA ACCOUNT
					break;
				case "EXIT":
					System.out.println("EXITING...");
					System.out.println("EXITED.");
					System.exit(0);//EXITS THE PROGRAM
				case "DETAILS":
					customer.displayCustomerDetails();//CALLS THE DISPLAY CUSTOMER DETAILS INSIDE CUSTOMER OBJECT
					break;
				}
			}
			//ISA USER MENU END
		
		}
		//ISA ACCOUNT CREATION END
		
		//CURRENT ACCOUNT CREATION START - ONLY OTHER ACCOUNT AVAILABLE IS CURRENT SO CURRENT ACCOUNT IS INSIDE "ELSE"
		else {
			
			//ACCOUNT OPENING START
			accounttype = "Current"; //SETS ACCOUNT TYPE TO CURRENT OTHERWISE IT WOULD BE NULL
			CurrentAccount curaccount = new CurrentAccount();//CREATES AN INSTANCE OF CURRENT ACCOUNT WHICH INHERITS FROM ACCOUNT
			customer.setLinkedacc(curaccount.getAccno());//SETS THE CURRENT ACCOUNT NUMBER INSIDE THE CUSTOMER OBJECT
			System.out.println("You have opened a Current Account!");
			System.out.println("Your current balance is: £" + curaccount.getBalance());//DISPLAYS BALANCE TO USER
			//ACCOUNT OPENING END
			
			//CURRENT ACCOUNT USER MENU START
			String choice = null;
			while (choice != "EXIT"){//CREATES USER MENU BASED ON VALUE OF "CHOICE"
			System.out.println("--ACCOUNT ADMIN--");
			System.out.println("Deposits - To deposit into you're account, type 'DEPOSIT' ");
			System.out.println("Withdrawals - To withdraw from you're account, type 'WITHDRAW'");
			System.out.println("Customer Details - To view you're customer details, type 'DETAILS'");
			System.out.println("Exit - To exit the program, type 'EXIT'");
			System.out.println("Current Balance - £" + curaccount.getBalance());//DISPLAYS BALANCE INSIDE MENU
			System.out.println("-----------------------------------------------------------------");
			choice = scan.nextLine();//PASSES USER INPUT TO VARIABLE "CHOICE"
				switch (choice){//PERFORMS ACTION BASED ON VALUE INSIDE "CHOICE"
				case "DEPOSIT":
					curaccount.curDep();//CALLS DEPOSIT METHOD FROM CURRENT ACCOUNT
					break;
				case "WITHDRAW":
					curaccount.curWithdraw();//CALLS WITHDRAW METHOD FROM CURRENT ACCOUNT
					break;
				case "EXIT":
					System.out.println("EXITING...");
					System.out.println("EXITED.");
					System.exit(0);//EXITS PROGRAM
					
				case "DETAILS":
					customer.displayCustomerDetails();//CALLS DISPLAY CUSTOMER DETAILS METHOD FROM CUSTOMER
					break;
				}
			}
			//CURRENT ACCOUNT USER MENU END
		
		}//CURRENT ACCOUNT CREATION END
			
	}//MAIN METHOD END
		
		
}//END OF CLASS
	
