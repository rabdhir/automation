package automobile;

/***
 * Difference in data type of arguments
 * @author rahmat
 *
 */

public class CarsOverloading2 {

	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight("8");

	}
	
	public static void increaseSeatHeight(int heightToIncrease) {
		System.out.println("Increase seat height by " + heightToIncrease + " inches");
	}
	
	public static void increaseSeatHeight(String heightToIncrease) {
		System.out.println("Increase seat height by " + heightToIncrease + " inches");
	}
	
	

}
