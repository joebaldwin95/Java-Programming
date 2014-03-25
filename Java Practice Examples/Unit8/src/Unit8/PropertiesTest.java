package Unit8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		
		try{
			FileInputStream fis = new FileInputStream("C:/props.properties");
			
			props.load(fis);
			
			System.out.println(props.getProperty("Property1"));
			System.out.println(props.getProperty("Property2"));
			System.out.println(props.getProperty("Property3"));
			
		}
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		catch (IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
