
import java.util.ArrayList;
public class VacationScaleTwo {
	public ArrayList vacationDays;
	public void setVacationScale(){ //START OF FUNCTION - SETS VACATION SCALE FOR EMPLOYEES
		vacationDays = new ArrayList(7);
		vacationDays.add(10);
		vacationDays.add(15);
		vacationDays.add(15);
		vacationDays.add(15);
		vacationDays.add(20);
		vacationDays.add(20);
		vacationDays.add(25);
		// END OF FUNCTION
		
		
			}
			
			
		
	
	public void displayVacationDays(){
		for (int years=0; years < vacationDays.size(); years++){
			System.out.println("The Vacation For: " + years + "Years of Service Are: " + vacationDays.get(years));
		}
	}

}
