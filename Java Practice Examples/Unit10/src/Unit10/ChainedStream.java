package Unit10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ChainedStream {

	public static void main(String[] args) {
		
		try 
		
		//Brackets Inside The Try Catch Mean AutoClose The Files
		(BufferedReader bufInput = new BufferedReader (new FileReader (args[0]));
			
				//Comma True Means Append the data inside the output file is not overwritten.
			BufferedWriter bufOutput = new BufferedWriter(new FileWriter(args[1], true))){ 
			
			//Holds Read Text
			String line = "";
			
			//While the line read from the file is not null do...
			while ((line = bufInput.readLine()) != null){
				//Modifys Line Of Text That Has Been Read In.
				line += ",5";
				bufOutput.write(line);
				bufOutput.newLine();
				
			}
			
		} catch (FileNotFoundException f) {
			
			System.out.println("File Not Found!");
			
				
			} catch (IOException e) {
				e.getMessage();
				//e.printStackTrace();
			}
			
			
		
				
		
		
		
		
		
		
		
		

	}

}
