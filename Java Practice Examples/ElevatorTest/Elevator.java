//---------------------------------------------
// Class  : Elevator
// Author : Joe Baldwin
// Notes  : Control class for a simple Elevator / Lift
//---------------------------------------------

public class Elevator {

	public boolean doorOpen = false;		// Default setting
	public int     currentFloor = 1;		// Default starting point
	
	public final int TOP_FLOOR = 10;
	public final int MIN_FLOOR = 1;
	
	//-----------------------------------
/*
 * Use a selection of comparison and relation operators 
 *  eg.  
 *  	<  (less than),    <= (less than or equal to)
 *  	>  (greater than), >= (greater than or equal to)
 *  	!= (not equal to), == (equal to)
 *  
 *  to add the appropriate checks to the following functions
 *  so that the elevator can operate safely.
 *  
 *  The rules for a safe elevator are as follows...
 *  
 *     1. Doors can only be opened if they are already closed
 *     2. Elevators shouldn't be able to go below the MIN_FLOOR value
 *     3. Elevators shouldn't be able to go above the TOP_FLOOR value
 *     
 *  Hint : 
 *  	
 *  	Use the following Java style code to add the correct selection
 *  
 *  	 if( <check> ) { 
 *  		... 
 *  	 } 
 *  	 else { 
 *  		... 
 *  	 }  
 */
	//----------------------------------------------------

	public void openDoor() { 
	if (doorOpen == true){
		System.out.println("Door Is Already Open");
	}
	else {
		System.out.println("Opening door.");
		doorOpen = true;
		System.out.println("Door is open.");
	}
	}
	
	//----------------------------------------------------
	
	public void closeDoor() {
		
		System.out.println("Closing door.");
		doorOpen = false;
		System.out.println("Door is closed.");
	}

	//----------------------------------------------------
	
	public void goUp() {
		if (currentFloor == TOP_FLOOR){
			System.out.println("Top Floor Reached");
		}
		else{
		System.out.println("Going up one floor.");
		currentFloor++;
		System.out.println("Floor: " + currentFloor);
		}
	}

	//----------------------------------------------------
	
	public void goDown() {
		System.out.println("Going down one floor.");
		currentFloor--;
		System.out.println("Floor : " + currentFloor);
	}
}
