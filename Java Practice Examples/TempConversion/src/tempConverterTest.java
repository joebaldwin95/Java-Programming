import java.util.Scanner;
public class tempConverterTest {

	public static void main(String[] args) {
		
		/*START OF TEST for "F ---> C" Conversion*/
		
		tempConverter ftoc = new tempConverter();
		
		double ftemp = 0;
		System.out.println("Please Enter The Temp In Farenheit To Convert To Celcius");
		Scanner in = new Scanner(System.in);
		
		ftemp = in.nextDouble();
		
		ftoc.calculateFtoC(ftemp);
		
		/*END OF TEST for "F ---> C" Conversion*/
		
		
		
		/*START OF TEST for "C ---> F" Conversion*/
		
		
		tempConverter ctof = new tempConverter();
		
		double ctemp = 0;
		
		System.out.println("Please Enter The Temp In Celcius To Convert To Fahrenheit");
		
		ctemp = in.nextDouble();
		
		ctof.calculateCtoF(ctemp);
		
		
		/*END OF TEST for "C ---> F" Conversion*/
		
	}

}
