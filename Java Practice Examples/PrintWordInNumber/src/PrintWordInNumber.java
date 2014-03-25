import java.util.Scanner;

public class PrintWordInNumber {
	public static void main(String args[]){
		
		Scanner scan = new Scanner (System.in);
		
		
		
		System.out.println("Enter Your Number");
		 int number = scan.nextInt(); 
		
		
		
		switch(number){
		
		case 1:
			System.out.println("ONE");
			break;
			
		case 9:
			System.out.println("NINE");
			break;
			
		case 2:
			System.out.println("TWO");
			break;
		
		default:
			System.out.println("OTHER");
			break;
		   }
		
		
	}

}
