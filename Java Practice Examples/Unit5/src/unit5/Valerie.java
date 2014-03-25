package unit5;

public class Valerie {
	
	private static Valerie instance;
	private static String description;
	
	
	private Valerie (String str){
		description = str;
	}
	
	
	public static Valerie getInstance(String desc){
		if (instance == null){
			instance = new Valerie (desc);
		}
		
		return instance;
	}
	
	public static String getDescription(){
		return description;
	}
	

}
