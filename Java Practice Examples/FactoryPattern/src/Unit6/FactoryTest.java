package Unit6;

public class FactoryTest {

	public static void main(String[] args) {
		
		Car c;
		Factory f = new Factory();
		
		c = f.carFactory(5, "Automatic");
		
		c.getDetails();
		
		System.out.println(c.getDetails());
		
		
		
		
		

	}

}
