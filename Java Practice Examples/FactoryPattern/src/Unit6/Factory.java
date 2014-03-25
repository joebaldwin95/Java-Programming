package Unit6;

public class Factory {
	
	public Car carFactory (int doors, String type){
		
		if (type.equals("Manual")){
			return new Manual(doors,"Black",0);
		}
		
		else if (type.equals("Automatic")){
			return new Automatic(doors,"Red",0);
		}
		
		return null;
		
		
	}
	
	
	

}
