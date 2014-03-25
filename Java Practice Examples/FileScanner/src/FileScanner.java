import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;


public class FileScanner {

	public static void main(String[] args)
		throws FileNotFoundException {
			
		int num1;
		double num2;
		String name;
		double sum;
		
		Scanner in = new Scanner (new File("in.txt"));
		
		num1 = in.nextInt();
		num2 = in.nextDouble();
		name = in.next();
		
		
		System.out.println("The Integer Read Is: " + num1);
		System.out.println("The Floating Point Number Read Is: " + num2);
		System.out.println("The String Read Is: " + name);
		
		}


	}


