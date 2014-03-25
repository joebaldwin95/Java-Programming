
public class TimeTable {
	public static void main (String args[]){
		
		//VARIABLES
		int size = 9;
		int val =0;
		//END OF VARIABLES 
		
		//DISPLAY TOP ROW
		System.out.println("     1  2  3  4  5  6  7  8  9");
		System.out.println("   ---------------------------");
		//END DISPLAY TOP ROW
			
			//START OF LOOP
			for (int row = 1;row <= size; row++){
				System.out.print(row+" | "); //PRINTS ROW NUMBERS
				
				
				for (int col =1; col <= size; col++){
					
					val = row *col;
					
					if (val < 10){
						
						System.out.print(" ");
						
					}
					
					System.out.print(val + " ");
				}
				
			 	System.out.println(); //ENDS PRINTING THE ROW NUMBERS
			
			}
		
	}
	

}
