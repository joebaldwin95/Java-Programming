package Exam;

public class Transaction {

	private static int tranNum =1;
	
	
	
	public Transaction(double price, int vatRate) {
		
		tranNum = tranNum++;
		
	}

}
