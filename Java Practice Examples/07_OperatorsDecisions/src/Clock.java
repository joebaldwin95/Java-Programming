
public class Clock {
	int currentTime = 1505;
	public void displayPartOfDay() {
		if (currentTime >= 801 && currentTime <= 1200){
			System.out.println("Morning");
			}
		if (currentTime >= 1201 && currentTime <= 1700){
			System.out.println("Afternoon");
			}
		if (currentTime >= 1701 && currentTime <= 2400){
			System.out.println("Evening");
			}
		if (currentTime >= 001 && currentTime <= 800){
			System.out.println("Early Morning");
			}
		
			
	
	}
	

}
