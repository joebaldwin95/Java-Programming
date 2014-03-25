package Excercises;

import java.util.Scanner;

public class ZellersCongruence {

	public static void main(String[] args) {
		
		int dayofweek;//output
		int dayofmonth; //input
		int month;//input
		int yearofcentury;//input
		int century;//input
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the day of the month e.g. 21");
		dayofmonth = in.nextInt();
		
		System.out.println("Please enter the month e.g December = 12");
		month = in.nextInt();
		
		System.out.println("Please enter the year in 1999 format");
		yearofcentury = in.nextInt();
		
		System.out.println("Please enter the century of the year e.g. 2013 = 20");
		century = in.nextInt();
		
		dayofweek = (dayofmonth + ((13 * (month + 1))/5) + yearofcentury + (yearofcentury / 4) + (century / 4) - (century * 2)) % 7;
		
		System.out.println(dayofweek);

	}

}
