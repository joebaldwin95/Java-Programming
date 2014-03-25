package Unit6;

public class Hitachi implements Dvd {

	@Override
	public void start() {
		System.out.println("DVD Starting");
		
	}

	@Override
	public void pause() {
		System.out.println("DVD Paused");
		
	}

	@Override
	public void stop() {
		System.out.println("DVD Stopping");
		
	}

	@Override
	public void eject() {
		System.out.println("DVD Ejecting");
		
	}

}
