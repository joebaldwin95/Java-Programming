package Unit6;

public class FlySteerTest {

	public static void main(String[] args) {
		
		Plane p = new Plane();
		
		p.takeOff();
		p.turnLeft();
		p.turnRight();
		p.land();
		
		//END OF PLANE
		
		Baloon b = new Baloon ();
		
		b.takeOff();
		b.land();
		
		//END OF BALOON
		
		Tractor t = new Tractor ();
		
		t.turnLeft();
		t.turnRight();
		
		//END OF TRACTOR
		
		
		
		

	}
	
	
	public void flying (Flyable f) {
		
		
		f.takeOff();
		
		f.land();
		
		
	}
	
	
	public void steering (Steerable s) {
		
		s.turnRight();
		
		s.turnLeft();
		
		
	}

}
