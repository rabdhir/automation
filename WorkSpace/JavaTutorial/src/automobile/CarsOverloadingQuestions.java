package automobile;
// Three ways to achieve method overloading
//1. Different number of parameters in arguments list
//2. Difference in data type of arguments
//3. Difference in sequence of data type of arguments
//4. Cannot overload just on return type

public class CarsOverloadingQuestions {

	public static void main(String[] args) {
		increaseSeatHeight("2", 2);

	}
	
	public static void increaseSeatHeight(String var1, int var2) {
		System.out.println("I am the first overload..");
	}
	
	public static void increaseSeatHeight(String var1, String var2) {
		System.out.println("I am the 2nd overload..");
	}

}
