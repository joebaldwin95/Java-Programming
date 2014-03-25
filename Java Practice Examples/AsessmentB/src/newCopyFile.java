//Imports used functions from lib
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class newCopyFile {
	public void copyFile (String inputfile, String outputfile) {

		BufferedReader buffread = null;
		BufferedReader buffread2 = null;
		String cLine;
try {
		File file = new File(inputfile);
		File file2 = new File (outputfile);
		
		 
		if (file2.exists() == false) file2.createNewFile();
		
		
		buffread = new BufferedReader(new FileReader(file));
		buffread2 = new BufferedReader(new FileReader(file2));
		
		while ((cLine = buffread.readLine())   !=null){
			buffread2.write(cLine);
			
		}
		
		
	}

		catch (FileNotFoundException e){
			System.out.println("File not found!");
				e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

finally {
	
		try {
			if(buffread  != null) buffread.close();
			if(buffread2 != null) buffread2.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	
	
	
}
		
		

	/*public newCopyFile(String inputFile, String outputFile)
	{ throws IOException{
	BufferedReader br = new BufferedReader(new FileReader(inputFile));
	BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile,true));
	String line;
	while ((line = br.readLine()) != null) {
	bw.write(line);
	bw.newLine();
	}
	bw.close();
	br.close();
	}
	}*/

	
	
	//TEST?
	
	newCopyFile testCopyFile = new newCopyFile();
	testCopyFile.newCopyFile("input.txt"."output.txt");
	
	
	
	
	
	
	
	}	
}
