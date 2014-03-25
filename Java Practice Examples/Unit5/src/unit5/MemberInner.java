package unit5;

public class MemberInner {
	
	private String prStr = "No Object should be able to change this";
	public String getprStr() {
		return prStr;
	}
	
	//MEMBER INNER CLASS
	
	public class MyInnerClass {
		public void changeTheString (String s){
			prStr = s;
		}
	}
	
	//END OF MEMBER INNER CLASS
	
	
	public MyInnerClass createAnInnerClass() {
		return new MyInnerClass();
	}
	
	
	
	

}
