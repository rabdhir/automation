
public class Car {
	private String make;
	int speed;
	int gear;
	
	//default no arg constructor
	public Car() {
		this(10,2);
		this.speed = 0;
		this.gear = 0;
		System.out.println("Executing constructor without argument");
	}
	
	public Car(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing constructor with arguments");
	}
	
	// this refers to an instance of class's object
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}

}
