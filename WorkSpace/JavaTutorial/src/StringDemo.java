public class StringDemo {

	public static void main(String[] args) {
		// String Literal - String Constant Pool 
		// does not create new objects, just add ref pointing to same object;
		String str1 = "Hello";
		
		String str3 = "Hello";
		
		// String Object - Heap
		String str2 = new String("Welcome");
		
		String str4 = new String("Welcome");
		
		// Strings are immutable
		
		str1 = "More Hello";
		
		String stradd = str1 + str2;
	}

}
