package automobile;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.increaseSpeed();
		c1.speed = 10;
		c1.publicSpeed = 30;

	}

}
