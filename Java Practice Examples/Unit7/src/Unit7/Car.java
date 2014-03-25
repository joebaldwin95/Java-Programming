package Unit7;

public abstract class Car {
	
	private int doors;
	private String colour;
	private int speed;
	
	public Car (int d, String c, int s){ //CONSTRUCTOR
		 doors = d;
		 colour = c;
		 speed = s;
	}
	
	public void start() {
		System.out.println("Car Starting");
	}
	
	public void stop() {
		System.out.println("Car Stopping");
	}
	
	public void turnLeft(){
		System.out.println("Car Turning Left");
	}
	
	public void turnRight(){
		System.out.println("Car Turning Right");
	}
	
	public void accelerate(int change){
		speed = (speed + change);
		System.out.println("Car Accelerating -  Speed: " + speed);
	}
	
	public void decelerate(int change){
		speed = (speed + change);
		System.out.println("Car Accelerating -  Speed: " + speed);
	}
	
	public String getDetails() {
		return "Doors: " + doors + "Colour: " + colour + "Speed: " + speed;
		
	}

	public abstract void changeUp();
	
	public abstract void changeDown();
	
	
	
}
