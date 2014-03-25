/*
 * Class Name: newTime.java
 * Author: Joe Baldwin
 * Purpose: Assessment
 * Date: 25/10/2013
*/

/*-------------------------------------------------------------------------------------------*/
public class newTime /*START OF CLASS*/
{
		//Check If Time Is Valid *START*
	public boolean valid24Time (int mm, int hh) {
				
		
			/*-------------------------------------------------------------------------*/
			if (hh > 23 || hh < 0 || mm > 59 || mm < 0) { //Check Minutes
				System.out.println("Invalid Time - Please Enter 24 Hour Format (23:59)");
				return false;
				
															}				
				//If Valid Return True
			else {
				System.out.println("The Time Is Valid!");
				return  true;
					 }		
			
			
												}

			
	   //Add 24 Hour Time Together *START*
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
		
		/*-------------------------------------------------------------------------*/

		
			if (total1 >= 24){
				//If total time exceeds 24 hour format 2400 hours will subtract to provide correct time
				total1 = (total1 - 24);
				}//*END OF SECOND TIME CHECK IF*
			
		/*-------------------------------------------------------------------------*/
			
			
		finalTime = (total1 * 100) + total2; //Adds Together The Two Times While Turning the hours in to 24h format
				
		
			
		System.out.println("Add Time Result (HH:MM) : " + finalTime);	
			
		return finalTime;
		
		/*-------------------------------------------------------------------------*/
		}
	/*-------------------------------------------------------------------------*/
	//Subtract 24 Hour Time *START*
	public int subtractTime (int hh1, int mm1, int hh2, int mm2){
	int total1;
	int total2;
	int finalTime;
	
	/*-------------------------------------------------------------------------*/
	
	total1 = (hh1 - hh2);
	total2 = (mm1 - mm2);
	
	/*-------------------------------------------------------------------------*/
	
	if (total2 > 59){
		total2 = total2 - 60;
		total1 = (total1 + 1);
	   }
	
	/*-------------------------------------------------------------------------*/

	
		if (total1 >= 24){
			//If total time exceeds 24 hour format 2400 hours will subtract to provide correct time
			total1 = (total1 - 24);
		}//END OF SECOND TIME CHECK IF
		
	/*-------------------------------------------------------------------------*/
		
		
	finalTime = (total1 * 100) + total2; //Adds Together The Two Times While Turning the hours in to 24h format
			
	
		
	System.out.println("Subtract Time Result (HH:MM) : " + finalTime);	
		
	return finalTime;
		
	}
}
	
	
	
//END OF CLASS


