package Unit8;

import java.io.PrintWriter;

public class PrintfExample {

	public static void main(String[] args) {
		
		double price = 24.99;
		int quantity = 2;
		String color = "Blue";
		
		PrintWriter pw = new PrintWriter(System.out, true);
		
		System.out.printf("We have %03d %s Polo shirts that cost $%3.2f.\n",quantity,color,price);
		System.out.format("We have %03d %s Polo shirts that cost $%3.2f.\n",quantity,color,price);
		
		
		//Holds formatted text in exactly the same way as above, just doesnt print out straight away.
		String out = String.format("We have %03d %s Polo shirts that cost $%3.2f.",quantity,color,price);
		/*---------------------------------------------------------------------------------------------*/
		
		System.out.println(out);
		pw.printf("We have %03d %s Polo shirts that cost $%3.2f.\n",quantity,color,price);
		
	}

}
