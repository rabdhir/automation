package automobile;

// abstract class cannot be instantiated
public abstract class AbstractCars {
	
	public int publicSpeed;
	
	protected int protectedSpeed;
	
	int speedLimit = 100;
	
	public AbstractCars() {
		this(0);
	}
	
	public AbstractCars(int startSpeed) {
	}
	
	public void setPrivateSpeed(int pSpeed) {
	}
	
	public abstract void engineStart(String keytype, int numOfCyl);

}
