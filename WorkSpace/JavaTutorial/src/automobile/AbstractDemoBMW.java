package automobile;

public class AbstractDemoBMW extends AbstractCars {
	
	public void setPrivateSpeed(int pSpeed) {
		super.setPrivateSpeed(10);
	}
	
// public void engineStart() {
//	//Super.engineStart();
//	System.out.println("BMWs has keyless engine start.");
	
//}
	
	@Override
	public void engineStart(String keytype, int numOfCyl) {
		System.out.println("This is the BMW engine start.");
		
	}
	
}
