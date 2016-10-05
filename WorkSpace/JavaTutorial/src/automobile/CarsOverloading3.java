package automobile;

/***
 * Sequence of data type of arguments
 * @author rahmat
 *
 */

public class CarsOverloading3 {
	
	public static void main(String[] args) {
		increaseSeatHeight("Honda Civic", 5);
		increaseSeatHeight(8, "Nissan Sentra");

	}
	
	public static void increaseSeatHeight(String var1, int var2) {
		System.out.println("I am the first overload..");
	}
	
	public static void increaseSeatHeight(int var1, String var2) {
		System.out.println("I am the second overload..");
	}

}
