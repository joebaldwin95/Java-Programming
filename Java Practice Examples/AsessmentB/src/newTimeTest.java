/*Class Name: newTimeTest
 * Author: Joe Baldwin
 * Date: 25/10/13
 */

import java.util.Scanner;
public class newTimeTest {

	public static void main(String[] args) {

		/*---------------------TEST VALID TIME----------------------------*/
		
		 newTime valid = new newTime();
		
		 int mm = 0;
		 int hh = 0;
		 Scanner validin = new Scanner (System.in);
		 
		 System.out.println("Please enter the hours you wish to check (HH)");
		 hh = validin.nextInt();
		 System.out.println("Please enter the minutes of the time you wish to check (MM)");
		 mm = validin.nextInt();
		 boolean validresult = valid.valid24Time(mm,hh);
		 
		//System.out.println(valid.valid24Time(mm, hh));
		
		/*-----------------------TEST ADD TIME-----------------------*/
		newTime time = new newTime();
		
		/*READ VARIABLES FROM USER INPUT*/
		
		Scanner in = new Scanner (System.in);
		
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
		
		/*----------------------CREATE RESULT VARIABLE--------------------------*/
			int result = time.addTime(h1, m1, h2, m2);
		
		/*----------------------END ADD TIME TEST--------------------*/
			
		/*-------------START SUBTRACT TIME TEST---------------------*/
			
			Scanner in2 = new Scanner (System.in);
			
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
			
			/*----------------------CREATE RESULT VARIABLE--------------------------*/
				int result2 = time.subtractTime(h3, m3, h4, m4);
				
			/*---------------------END SUBTRACT TEST----------------------*/
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
