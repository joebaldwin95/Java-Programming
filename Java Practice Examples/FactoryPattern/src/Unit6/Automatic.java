package Unit6;

public class Automatic extends Car {

	public Automatic(int d, String c, int s) {
		super(d, c, s);
	}

	@Override
	public void changeUp() {
		System.out.println("Changing Up");
		
	}

	@Override
	public void changeDown() {
		System.out.println("Changing Down");
		
	}
	
	
	public String getDetails() {
		return super.getDetails() + "Type = Automatic";
		
	}
	

}
