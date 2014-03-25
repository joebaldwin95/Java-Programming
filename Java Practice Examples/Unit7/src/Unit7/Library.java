package Unit7;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	
	
	
	private List <Book> catalouge = new ArrayList<>(); //Create an ArrayList that only holds books.
	
	public Library (){
		
		
		
		Book book1 = new Book("Sam Killoway | ","How To Kill Your Whole Family... Quietly");
		
		Book book2 = new Book("Ryan Lowers | ","Climbing and stuff");
		
		Book book3 = new Book("Chay CH | ","How To Be Better Than Me At COD");
		
		catalouge.add(book1);
		
		catalouge.add(book2);
		
		catalouge.add(book3);
		
		
		
		
		
	}
	
	public void displayAll(){
		
		
		for (Book temp : catalouge){
			System.out.println(temp.getDetails()); // Creates a temp variable holding all refs to book + book methods.
		}
		
		
		
		
		
		
		
	}
	

}
