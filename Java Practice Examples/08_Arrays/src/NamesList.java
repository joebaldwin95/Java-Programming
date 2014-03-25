import java.util.ArrayList;
public class NamesList {
	ArrayList listOfNames;
	
	public void setList(){
		listOfNames = new ArrayList();
		listOfNames.add("Joe Smith");
		listOfNames.add("Gus Fring");
		listOfNames.add("Walter White");
		listOfNames.add("Jesse Pinkman");
		
		System.out.println("Names List: " + listOfNames);
		System.out.println("Size of ArrayList: " + listOfNames.size());
		
		
	}
	

}
