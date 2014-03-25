package Interface5_1;

public class CourierTest {

	public static void main(String[] args) {
		
		CourierSLA csla = new MotorBikeCourier();
		
		csla.collectPackageOnTime();
		
		csla.deliverPackageOnTime();
		
	}

}
