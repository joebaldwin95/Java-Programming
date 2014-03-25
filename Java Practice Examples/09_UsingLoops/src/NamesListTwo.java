import java.util.ArrayList;


public class NamesListTwo {
	public ArrayList listOfNames;
	
	public void setList(){
		listOfNames = new ArrayList();
		listOfNames.add("Joe Smith");
		listOfNames.add("Mary Palmer");
		listOfNames.add("Jose Gonzalez");
		listOfNames.add("Linda Baker");
		System.out.println("Size Of Array Is: " + listOfNames.size());
		
	}
	
	public void displayNames(){
		System.out.println("Names In The ArrayList: ");
		int i;
		for (i=0;i<listOfNames.size();i++){
			System.out.println(listOfNames.get(i));
		}
	}

}
