
public class tempConverter {
	
	double divideres1;
	double result1;
	double result2;
	
	public void calculateFtoC (double ftemp){
		
		divideres1 = (ftemp - 32);
		result1 = (divideres1 / 1.8);
		System.out.println("Result Temp: " + result1);
		
		
	}
	
	public void calculateCtoF (double ctemp){
		result2 = (ctemp / 1.8);
		System.out.println("Result Temp: " + result2);
		
		
	}
	
	
	
	
	
	

}
