
public class Person {

	int Years = 1;
	int Days;
	long Minutes;
	long Seconds;
	long Milliseconds;
	
	public void CalculateAge()
	{
		Days = Years * 365;
		Seconds = Days * 24 * 60 * 60;
		Minutes = Seconds / 60;
		Milliseconds = Seconds / 1000;
		System.out.println("You Are " + Days + "Days Old");
		System.out.println("You Are " + Seconds + "Seconds Old");
		System.out.println("You Are " + Minutes + "Minutes Old");
		System.out.println("You Are " + Milliseconds + "Milliseconds Old");
		
	}

	}
	
	
	
	
	
	
	
}