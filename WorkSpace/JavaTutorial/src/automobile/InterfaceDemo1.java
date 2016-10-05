package automobile;

public class InterfaceDemo1 {

	public static void main(String[] args) {
		CarsInterface myInterface = new InterfaceDemo(); 
		// InterfaceDemo myInterface = new InterfaceDemo(); //this is also valid
		myInterface.engineStart("6-Cylinder", true);

	}

}
