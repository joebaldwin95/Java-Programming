
/*
 * Class Name: newTime.java
 * Author: Joe Baldwin
 * Purpose: Assessment
 * Date: 25/10/2013
*/

/*-------------------------------------------------------------------------------------------*/
public class newTime /*START OF CLASS*/
{
	/**
	 * Time Validator
	 * Checks If The Time Is Valid
	 * @param mm - minutes
	 * @param hh - hours
	 * @return if time valid - true
	 * @return if time isnt valid - false
	 */
	public boolean valid24Time (int mm, int hh) {
				
		
			/*-------------------------------------------------------------------------*/
			if (hh > 23 || hh < 0 || mm > 59 || mm < 0) { //Checks The Time Against Set Rules
				System.out.println("Invalid Time - Please Enter 24 Hour Format (23:59)");
				return false; //If Invalid Return False
				
														}				
			
			else {
				System.out.println("The Time Is Valid!");
				return  true; //If Valid Return True
			     }		
			
			
												}
/*-------------------------------------------------------------------------------------------*/
	
	/**
	 * Time Addition Method
 * Desc - Adds two 24hour format times together
 * @param hh1 - First set of hours
 * @param mm1 - First set of minutes
 * @param hh2 - Second set of hours
 * @param mm2 - Second set of minutes
 * @return - finalTime - Total of addition
 */
public int addTime (int hh1, int mm1, int hh2, int mm2) {
		
		//Calculation Variables
		int total1;
		int total2;
		int finalTime;
		
		//Addition Calculation
		total1 = (hh1 + hh2);
		total2 = (mm1 + mm2);
		
		//Checks For Minutes Passing Into Hours
		if (total2 > 59){
			total2 = total2 - 60;
			total1 = (total1 + 1);
		   				}

		
		if (total1 >= 24){
		//If total time exceeds 24 hour format 2400 hours will subtract to provide correct time
			total1 = (total1 - 24);
						 }
			
		finalTime = (total1 * 60) + total2; //Adds Together The Two Times While Turning the hours in to 24h format
				
		System.out.println("Add Time Result (HH:MM) : " + finalTime);	
			
		return finalTime;
		
		}//End of method
/*-------------------------------------------------------------------------------------------*/
	
	/**
	 * Time Subtraction Method
	 * Desc - Subtracts one 24 hour time from another
	 * @param hh1
	 * @param mm1
	 * @param hh2
	 * @param mm2
	 * @return - finalTime - Result of subtraction
	 */
	public int subtractTime (int hh1, int mm1, int hh2, int mm2){
	int total1;
	int total2;
	int finalTime;
	
	total1 = (hh1 - hh2);
	total2 = (mm1 - mm2);
	
	
	if (total2 > 59){
		total2 = total2 - 60;
		total1 = (total1 + 1);
	   				}
	
		if (total1 >= 24){//If total time exceeds 24 hour format 2400 hours will subtract to provide correct time
		    total1 = (total1 - 24);
						 }
		
	finalTime = (total1 * 60) + total2; //Adds Together The Two Times While Turning the hours in to 24h format
			
	System.out.println("Subtract Time Result (HH:MM) : " + finalTime);	
		
	return finalTime; //Returns result variable
		
	}



}					/*END OF CLASS*/



