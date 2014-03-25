package unit5;

public class ValerieTest {

	public static void main(String[] args) {
		
		Valerie singleton1 = Valerie.getInstance("This is the first time it was done");
		
		System.out.println(singleton1.getDescription());
		
		Valerie singleton2 = Valerie.getInstance("This is the second time, that I will say these words");
		
		System.out.println(singleton2.getDescription());
		
	}

}
