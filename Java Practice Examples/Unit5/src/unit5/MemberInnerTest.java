package unit5;

public class MemberInnerTest {

	public static void main(String[] args) {
		
		MemberInner meminner = new MemberInner();
		
		MemberInner.MyInnerClass test = meminner.createAnInnerClass();
		
		System.out.println("Private String Value Is: " + meminner.getprStr());
		
		test.changeTheString("I NOW HAVE THE POWER TO CHANGE A PRIVATE VARIABLE");
		
		System.out.println("Private String Value Is: " + meminner.getprStr());
		
		
		
		

	}

}
