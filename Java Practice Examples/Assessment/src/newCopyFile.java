import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Name - newCopyFile.java
 * @author JBALDWIN
 * Date - 25/10/13
 * Desc - Reads from one text file and writes to another
 */

public class newCopyFile {


/**
 * Copy File Method
 * @param inputFile - file name of input
 * @param outputFile - file name of output
 */
public void copyFile(String inputFile, String outputFile){
try {
	BufferedReader buffread = new  BufferedReader(new FileReader(inputFile)); //Creates buffread object using FileReader
		
	BufferedWriter buffwrite = new  BufferedWriter(new FileWriter(outputFile,true)); //Creates buffwrite object using FileWrite
		String ln;
		
	while ((ln = buffread.readLine()) != null) {
		
		buffwrite.write(ln);
		buffwrite.newLine();//Writes Data to file
											  
											   }
	
		buffwrite.close(); //Closes write after copy is finished
		buffread.close(); //Closes read after data has been written
	
	}
		catch (FileNotFoundException e){
			System.out.println(e);//Displays Exception

	} catch (IOException e) {
			e.printStackTrace();
	}
}}

