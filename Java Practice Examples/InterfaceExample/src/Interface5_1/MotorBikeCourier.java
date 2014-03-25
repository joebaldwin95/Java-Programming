package Interface5_1;

public class MotorBikeCourier implements CourierSLA {

	@Override
	public void collectPackageOnTime() {
		System.out.println("MotorBike In Use - Collecting Package");
		
	}

	@Override
	public void deliverPackageOnTime() {
		System.out.println("MotorBike In Use - Delivering Package");
		
	}

}
