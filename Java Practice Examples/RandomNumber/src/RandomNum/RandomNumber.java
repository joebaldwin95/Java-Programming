package RandomNum;

public class RandomNumber {
	
	public void numGen (){

		

	double num1 = 0;
	char num2 = 0;
	
	 num1 = Math.random() * 27;
	 num2 = (char) (num1 + 65);
	  
	 System.out.println("Number : " + num2);
	 
	 
	}
	
	
	public void displayUppercase (){
		
		for (int randomNum = 65; randomNum <= 90; randomNum++){
			
			char letterList = (char) randomNum;
			
			System.out.println("Your Letter Is: " + letterList + " " + randomNum);
		}
		
		
	}
	
	
	public void displayLowerCase (){
		
		for (int randomNum = 97; randomNum <= 120; randomNum++){
			
			char letterList = (char) randomNum;
			
			System.out.println("Your Letter Is: " + letterList + " " + randomNum);
		}
		
		
	}
	
	
}
