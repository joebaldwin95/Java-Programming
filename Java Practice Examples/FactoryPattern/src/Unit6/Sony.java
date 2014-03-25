package Unit6;

public class Sony implements Television {

	int channel = 1;
	
	@Override
	public void on() {
		System.out.println("TV is now ON");
		
	}

	@Override
	public void off() {
		System.out.println("TV Shutting Off");
		
	}

	@Override
	public void upChannel() {
		System.out.println("Channel Up");
		channel++;
		if (channel > 1000) {
			channel = 1000;
		}
	}

	@Override
	public void downChannel() {
		System.out.println("Channel Down");
		channel--;
		if (channel < 0) {
			channel = 0;
		}
	}

}
