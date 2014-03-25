package unit5;

public class AnonymousDemo {

	public static void main(String[] args) {
		
		Object normal = new Object(); //NORMAL OBJECT
		
		Object anonymous = new Object () {
			
			public String toString(){
				return "In an anonymous inner class method";
			}
			
		};
		
		
		System.out.println("Normal: " + normal.toString());
		
		System.out.println("Anonymous: " + anonymous.toString());
		
		
		
		
		

	}

}
