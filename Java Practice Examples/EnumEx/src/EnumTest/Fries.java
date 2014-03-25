package EnumTest;

public enum Fries {
	
	SMALL			( "200g of fries" ) ,
	REGULAR		( "300g of fries" ) ,
	LARGE			( "500g of fries" ) ; 

	private String quantity;
	
	private Fries (String a){
		quantity = a;
	}

	public String getQuantity() {
		return quantity;
	}
	
	
}
