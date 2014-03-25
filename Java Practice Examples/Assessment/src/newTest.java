/*Class Name: newTest
 * Author: Joe Baldwin
 * Date: 25/10/13
 */

import java.io.IOException;
import java.util.Scanner;
public class newTest {

	public static void main(String[] args) throws IOException {

		/*---------------------TEST VALID TIME----------------------------*/
		
		 newTime valid = new newTime(); //Valid Time Object Creation
		
		 int mm = 0;
		 int hh = 0;
		 Scanner validin = new Scanner (System.in); //Scanner Initialisation
		 
		 System.out.println("Please enter the hours you wish to check (HH)");
		 	hh = validin.nextInt();
		 System.out.println("Please enter the minutes of the time you wish to check (MM)");
		 	mm = validin.nextInt();
		 boolean validresult = valid.valid24Time(mm,hh); //Result Variable Created

		/*-------------------END TEST VALID TIME------------------------*/
		 
		 
		 
		 
		 
		/*----------------------TEST ADD TIME--------------------------*/
		newTime time = new newTime(); //Time Object Creation
		
		Scanner in = new Scanner (System.in); //Scanner Initialisation
		
		//Hour and Minute Variables To Be Passed To Method Via Scanner
		int h1; 
		int h2;
		int m1;
		int m2;
		
		System.out.println("Please enter your first hours you wish to add (HH)");
			h1 = in.nextInt();
		System.out.println("Please enter your first minutes (MM)");
			m1 = in.nextInt();
		System.out.println("Please enter your second hours you wish to add (HH)");
			h2 = in.nextInt();
		System.out.println("Please enter your second minutes you wish to add (MM)");
			m2 = in.nextInt();

			int result = time.addTime(h1, m1, h2, m2); //Creates Result
		
		/*----------------------END ADD TIME TEST--------------------*/
			
			
			
			
			
		/*-------------START SUBTRACT TIME TEST---------------------*/
			
			Scanner in2 = new Scanner (System.in); //Scanner Initialisation
			
			
			//Hour and Minute Variables To Be Passed To Method Via String
			int h3; 
			int h4;
			int m3;
			int m4;
			
			System.out.println("Please enter your first hours you wish to subtract (HH)");
				h3 = in2.nextInt();
			System.out.println("Please enter your first minutes (MM)");
				m3 = in2.nextInt();
			System.out.println("Please enter your second hours you wish to subtract (HH)");
				h4 = in2.nextInt();
			System.out.println("Please enter your second minutes you wish to subtract (MM)");
				m4 = in2.nextInt();
			

				int result2 = time.subtractTime(h3, m3, h4, m4); //Creates Result
				
		/*---------------------END SUBTRACT TEST----------------------*/
				
				
/*-----------------------------------------NEWCOPYFILE TEST-------------------------------------------*/
	
				//File Name Variables
				String input; 
				String output;
	
				//Scanner Initialisation To Input Filenames
				Scanner filein = new Scanner (System.in);			
	
				//File Name Input
				System.out.println("Enter the file name of your input (Including Extension .txt)");
					input = filein.next();
				System.out.println("Enter the file name of your output (Including Extension .txt)");
					output = filein.next();
	
				//File Copy Object + File Name Variables Are Passed To Method
				newCopyFile testCopyFile = new newCopyFile();
				testCopyFile.copyFile(input,output);
							
				
			
/*---------------------------------------END NEWCOPYFILE TEST-------------------------------------------*/			
			
			
	}

}

