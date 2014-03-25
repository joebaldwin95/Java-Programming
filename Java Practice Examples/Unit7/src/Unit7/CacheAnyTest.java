package Unit7;

public class CacheAnyTest {

	public static void main(String[] args) {
		
		CacheAny <String> x1 = new CacheAny <>();
		
		x1.add("Hello Pretty Lady");
		
		System.out.println(x1.get());
		
		
		CacheAny <Car> x2 = new CacheAny <>();
		
		x2.add(new Automatic(2,"Black",0));
		
		
		System.out.println(x2.get().getDetails());
		
		
		
		
		
		
		
		

	}

}
