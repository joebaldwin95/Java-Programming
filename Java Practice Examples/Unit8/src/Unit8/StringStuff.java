package Unit8;

import java.util.Date;

public class StringStuff {

	public static void main(String[] args) {
		
		int i = 7;
		String s = "Hello";
		char  c = 'A';
		
		System.out.println(i + " " + s + " " + c);
		System.out.format("%d %s %s \n",i,s,c);
		
		String temp = " ";
		
		StringBuffer myBuffer = new StringBuffer();
		
		long	startTime	= (new Date()).getTime() ;
		
		for (int count = 0; count < 10000; count++ ){
			
			myBuffer.append("a");
			
		}
		
		long endTime = (new Date()).getTime();

		long finalTime = endTime - startTime;
		
		System.out.println(finalTime);
		
		
		
		
		
		

	}

}
