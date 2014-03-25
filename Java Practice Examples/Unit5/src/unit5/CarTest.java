package unit5;

public class CarTest {

	public static void main(String[] args) {
		
		Automatic Car = new Automatic(4, "Blue", 40);
		
		Manual Car2 = new Manual (5, "Red", 25);
		
		System.out.println("STARTING MANUAL TEST");
		
		Car2.changeUp();
		
		Car2.changeDown();
		
		Car2.getDetails();
		
		System.out.println("STARTING AUTOMATIC TEST");
		
		Car.changeUp();
		
		Car.changeDown();
		
		System.out.println(Car.getDetails());
		
		
		
		
		
		
		
		
		
		

	}

}
