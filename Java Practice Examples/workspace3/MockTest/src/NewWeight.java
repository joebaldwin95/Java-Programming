
/**
 * CodeInfo
 * @author JBALDWIN
 * Date: 24/10/13
 */
public class NewWeight {
	
	//Global Variables To Hold Weight
	
	int stones1;
	int pounds1;
	int ounces1;
	//CONSTRUCTOR
	
	public NewWeight (int stones, int pounds, int ounces){

		System.out.println("NewWeight constructor");
		
		stones1 = stones;	// etc
		pounds1 = pounds;
		ounces1 = ounces;
		
		System.out.println("s = " + stones1);
		System.out.println("p = " + pounds1);
		System.out.println("o = " + ounces1);
	}

	
	public boolean validWeight() {//VALID WEIGHT CHECK
		
		//START OF VALID CHECK
		if (stones1 < 0){
			return false;
		}
		
		if (pounds1 > 13){
			return false;
		}
		
		if (pounds1 < 0){
			return false;
		}
		
		if (ounces1 < 0){
			return false;
		}
		
		if (ounces1 > 15){
			return false;
		}
		
		else {
			return true;
		}
		
		//END OF VALID CHECK
	}
	
	// ADDS USER INPUT WEIGHT TO PRE-SET WEIGHT
	public void addWeight(int stones2, int pounds2, int ounces2){
		
		//Stores total after calculation
		int totalPounds;
		int totalStones;
		int totalOunces;
		
		//Calculation
		totalStones = (stones1 + stones2);
		totalPounds = (pounds1 + pounds2);
		totalOunces = (ounces1 + ounces2);
		//Displays Result of Calculation
		System.out.println("Stones: " + totalStones+ "Pounds: " + totalPounds +"Ounces: " + totalOunces);
		
		
		
		
		
		
		
		
		
		
		
	}
}
