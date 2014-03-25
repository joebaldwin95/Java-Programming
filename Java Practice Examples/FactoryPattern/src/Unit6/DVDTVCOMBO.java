package Unit6;

public class DVDTVCOMBO implements Dvd, Television{

	
	private Television t;
	private Dvd d;
	
	Sony sony = new Sony();
	Hitachi hit = new Hitachi();
	
	
	@Override
	public void on() {
		sony.on();
		
	}

	@Override
	public void off() {
		sony.off();
		
	}

	@Override
	public void upChannel() {
		sony.upChannel();
		
	}

	@Override
	public void downChannel() {
		sony.downChannel();
		
	}

	@Override
	public void start() {
		hit.start();
		
	}

	@Override
	public void pause() {
		hit.pause();
		
	}

	@Override
	public void stop() {
		hit.stop();
		
	}

	@Override
	public void eject() {
		hit.eject();
		
	}

}
