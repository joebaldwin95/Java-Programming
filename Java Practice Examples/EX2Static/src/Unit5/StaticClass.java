package Unit5;

public class StaticClass {
	
	private static int counter = 0;
	
	public void adder( int amount ){
		
		amount = 5;
		
		counter = (counter + amount);
		
	}
	
	
	public void subtracter( int amount ){
		
		amount = 5;
		
		counter = (counter + amount);
		
	}
	
	
	void showCounter() {
		
		System.out.println("Counter: " + counter);
		
	}
	

}
