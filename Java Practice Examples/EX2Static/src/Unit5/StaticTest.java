package Unit5;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticClass sc1 = new StaticClass();
		
		StaticClass sc2 = new StaticClass();
		
		testStaticClass( sc1 , 20 );
		
		testStaticClass( sc2 , 30 );
		
	}
	
	private static void testStaticClass( StaticClass sc , int amount ){
		
		sc.adder(amount);
		
		sc.showCounter();
		
		
	}

}
