package automobile;

public class Cars {
	// No Modifier - accessible in the same package
	int speed;
	// only in class
	
	@SuppressWarnings("unused")
	private int privateSpeed;
	// anywhere
	public int publicSpeed;
	
	protected int protectedSpeed;
	
	int speedLimit = 100;
	
	public Cars() {
		this(0);
	}
	
	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}
	
	public Cars(int startSpeed) {
		speed = startSpeed;
	}
	
	public void increaseSpeed() {
		if (speed < 100) {
			speed++;	
		}
		System.out.println("Increasing Speed of Cars: ");
	}
	
	public void decreaseSpeed() {
		if (speed < 100) {
			speed--;	
		}
		System.out.println("Decreasing Speed of Cars: ");
	}

}
