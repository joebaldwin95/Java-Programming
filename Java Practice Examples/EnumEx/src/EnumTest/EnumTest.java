package EnumTest;

public class EnumTest {
	
	public static void main (String args[]){
		
		Fries s = Fries.SMALL; //Calls The Small ENUM
		
		Fries r = Fries.REGULAR; //Calls The Reg ENUM
		
		Fries l = Fries.LARGE; //Calls The Large ENUM
		
		System.out.println("Small gets ya'll: " + s.getQuantity()); 
		
		System.out.println("Regular gets ya'll: " + r.getQuantity());
		
		System.out.println("Large gets ya'll: " + l.getQuantity());
		
		
		
		
	}

}
