package Excercises;

public class MeetTheFamily {

	public static void main(String[] args) {
		//Initialise Age Variables
		int mumAge = 34;
		int dadAge = 43;
		int sonAge = 12;
		int dauAge = 18;
		
		//Initialise Name Variables
		String mumName = "Sharon";
		String dadName = "Ozzy";
		String sonName = "Frank";
		String dauName = "Lottie";
		
		//Output Results
		System.out.println("The Mother Of This Family Is Called: " + mumName + " And Her Age Is: " + mumAge);
		System.out.println("The Father Of This Family Is Called: " + dadName + " And His Age Is: " + dadAge);
		System.out.println("The Son Of This Family Is Called: " + sonName + " And His Age Is: " + sonAge);
		System.out.println("The Daughter Of This Family Is Called: " + dauName + " And Her Age Is: " + dauAge);
		
		//Average Age Calculation
		double aveAge;
		aveAge = (((double)mumAge + (double)dadAge) / 2);
		System.out.println("The Average Age Of The Parents Are: " + aveAge);
		
		//Age Addition Calculation (+)
		int smAge;
		int ddAge;
		ddAge = (dadAge + dauAge);
		smAge = (mumAge + sonAge);
		
		//Age Addition Validation (IF)
		if (smAge > ddAge){
			System.out.println("The Mother And Sons Age's Are Greater Than The Fathers And Daughters!");
		}
		else{
			System.out.println("The Mother And Sons Age's Are Not Greater Than The Fathers And Daughters!");
		}
		
		//Age Addition Calculation (-)
		int sdAge;
		int mdAge;
		sdAge = (dadAge - sonAge);
		mdAge = (mumAge - dauAge);
		
		//Age Addition Validation (Logical Operator)
		String result = (sdAge > mdAge)?"True - The Fathers Age Minus The Sons Is Greater":"False - The Mothers Age Minus The Daughters Is Greater";
		System.out.println(result);
		
		//Sons Age Increment 
		for (int sonAge1 = 21; sonAge1 <= dadAge; sonAge1++){
			System.out.println("Son Age: "+ sonAge1);
		}
		
		//Daughters Age Birthday Message
		for (int dauAge1 = 1; dauAge1 <= 15; dauAge1 ++){
			System.out.println("Happy Birthday You Are: " + dauAge1 + " Great Success!!!");
		}
		
		

	}

}
