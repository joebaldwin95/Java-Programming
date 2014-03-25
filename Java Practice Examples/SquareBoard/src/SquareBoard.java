
public class SquareBoard { // saved as "SquareBoard.java"
	public static void main (String[] args) 
	{
		int size = 5; // size of the board
				
		for (int row = 1;row <= size; row++) 
		{
			for (int col = 1; col <= size; col++)
				
			{
				for (col = 1; row <= size; row++) {
					
					if (col % 2 == 0) {
						System.out.print(" ");
						
					}
				}
					
				System.out.print("# ");
			}

			System.out.println();
		}
	}
}