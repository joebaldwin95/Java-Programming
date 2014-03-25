package LotteryPrinterPackage;

import java.util.Random;

public class LotteryPrinter {
	
	Random generator = new Random();
	int lotteryNo;
	
	public void lotteryGen (){
		
		for (int count = 1; count <= 6; count++){
			lotteryNo = generator.nextInt(49) + 1;
			System.out.print(lotteryNo+" ");
		}
		
		
		
		
		
		
		
	}

}
