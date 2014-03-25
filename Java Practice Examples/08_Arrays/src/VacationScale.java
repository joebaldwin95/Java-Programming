
public class VacationScale {
	int [] vacationDays;
	int    yearsOfService;
	
	public void setVacationScale(){
		vacationDays = new int[7];
		
		vacationDays[0] = 10;
		vacationDays[1] = 15;
		vacationDays[2] = 15;
		vacationDays[3] = 15;
		vacationDays[4] = 20;
		vacationDays[5] = 20;
		vacationDays[6] = 25;
	}
		
	public void displayVacationDays(){
		
		int temp = yearsOfService;
				   if (temp > 6){
					   temp = 6;
				   }
		
		if (yearsOfService < 1){
			System.out.println("NO DAYS AVAILABLE");
		}
		
		else {
		
		int holidayDays = vacationDays[temp];
		System.out.println("This Employee With " + yearsOfService + " Has " + holidayDays + " Days Available");
		}
	}
		
		
		

		
	

}
