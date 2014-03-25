package Exam;

public class TransactionFactory {
	
	//METHOD TO BE CALLED IN THE TEST WITH PARAMETERS
	public Transaction createTransaction (boolean promo, double price, int vatRate) {
		
		if (promo) {
			
			//CREATES A PROMOTION TRANSACTION AND PASSES THE METHODS VALUE TO THE NEW TRANSACTION
			return new PromotionalTransaction(price,vatRate);
			
			
			
		}
		
		else {
			
			//CREATES A NORMAL TRANSACTION AND PASSES THE METHODS VALUE TO THE NEW TRANSACTION
			return new Transaction(price,vatRate);
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
