//---------------------------------------------
// Class  : ElevatorTest
// Author : < put your name here >
// Notes  : Test harness for the elevator class
//---------------------------------------------

public class ElevatorTest {

	public static void main(String[] args) {
		
		Elevator myElevator = new Elevator();
		
		myElevator.openDoor();
		myElevator.closeDoor();
		myElevator.goDown();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.goUp();
		myElevator.openDoor();
		myElevator.closeDoor();
		myElevator.goDown();
		myElevator.openDoor();
		myElevator.goDown();
		myElevator.openDoor();
		
		// Add more tests as appropriate.
		
	}
}
