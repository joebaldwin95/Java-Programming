package Interface5_1;

public class CycleCourier implements CourierSLA {

	@Override
	public void collectPackageOnTime() {
		System.out.println("Cycle In Use - Collecting Package");
		
	}

	@Override
	public void deliverPackageOnTime() {
		System.out.println("Cycle In Use - Delivering Package");
		
	}

}
