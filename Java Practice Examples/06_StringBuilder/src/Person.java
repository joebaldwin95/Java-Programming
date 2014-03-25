
public class Person {
	StringBuilder sbname;
	StringBuilder sbphonenumber;
	
	Person (String name, int age) {

		System.out.println("Constructor..." + name);
		sbname = new StringBuilder(8);
		sbphonenumber = new StringBuilder();

		sbname.append(name);
	}
	
	public void displayPersonInfo() {
		
		sbname.append("John");
		sbname.append(" ");
		sbname.append("Smith");
		System.out.println(sbname.toString());
		System.out.println("Capacity : " + sbname.capacity());
		

	}

}