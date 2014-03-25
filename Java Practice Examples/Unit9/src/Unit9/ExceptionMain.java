package Unit9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionMain 
{

	public static void main(String[] args) 
	{
		
		try 
		{
		
			System.out.println("Reading from file: " + args[0]);
		 
		
			BufferedReader b = new BufferedReader (new FileReader(args[0]));
			String s = null;
			while ((s=b.readLine()) != null) 
			{
				System.out.println(s);
			} 
		
		}
		
		
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("No File Is Specified, Quitting!!!");
			System.exit(1);
			
			
			
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace();
		} catch (IOException e) {
			
			//e.printStackTrace();
		}
		
	}
		

		
		
		
		
		

}


