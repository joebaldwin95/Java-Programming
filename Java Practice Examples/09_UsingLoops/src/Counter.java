
public class Counter {
	public final int MAX_COUNT = 100;
	 
	public void displayCount(){
	
		int i,by12;
		
		for (i=0; i < MAX_COUNT; i++) {

			

			by12 = i % 12;
					
			if((i > 1) && (by12 == 0))
			{
				System.out.print(i + " ");
				
			}
			
			
	/*		
			if((i % 12) == 0)
			{
				System.out.print(i);
				
			}
	*/
			
			
			
			
			
		}
	}
	

}
