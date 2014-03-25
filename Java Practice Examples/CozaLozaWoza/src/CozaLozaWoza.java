public class CozaLozaWoza { // saved as "CozaLozaWoza.java"
	public static void main(String[] args) {
		int lowerbound = 1;
		int upperbound = 110;
		
		boolean d3;
		boolean d5;
		boolean d7;
		boolean d11;
		
		for (int number = lowerbound; number <= upperbound; ++number) {
			
			d3 = d5 = d7 = d11 = false;
			
			if ((number % 3) == 0) d3 = true;
			if ((number % 5) == 0) d5 = true;
			if ((number % 7) == 0) d7 = true;
			if ((number % 11) == 0) d11 = true;

			
			
			// Print "Coza" if number is divisible by 3
			if (d3 == true) {
				System.out.print(" Coza ");
			}
			// Print "Loza" if number is divisible by 5
			if (d5 == true) {
				System.out.print(" Loza ");
			}
			// Print "Woza" if number is divisible by 7
			if (d7 == true) {
				System.out.println(" Woza ");
			}
			// Print the number if it is not divisible by 3, 5 and 7
			if (d3 = d5 = d7 = d11 == false) {
					System.out.print(number);
			}
			// Print a newline if number is divisible by 11; else print a space
			if ((number % 11) == 0) {
				System.out.println();
				
			
			}
		}
	}
}