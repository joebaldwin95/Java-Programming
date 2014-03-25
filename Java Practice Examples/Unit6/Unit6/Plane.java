package Unit6;

public class Plane implements Steerable, Flyable {

	@Override
	public void takeOff() {
		System.out.println("Plane Taking Off");
		
	}

	@Override
	public void land() {
		System.out.println("Plane Landing");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("Plane Turning Left");
		
	}

	@Override
	public void turnRight() {
		System.out.println("Plane Turning Right");
		
	}

}
