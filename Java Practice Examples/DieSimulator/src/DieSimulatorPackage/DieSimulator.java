package DieSimulatorPackage;

import java.util.Random;

public class DieSimulator {
	
	Random generator = new Random();
	
	int rolledNo;
	
	public void randomGen(){
		
		rolledNo = generator.nextInt(6) + 1;
		System.out.println("Dice Result: "+rolledNo);
		
		
	}
	
	
	
	
	

}
