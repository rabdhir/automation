package interviewquestions;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "This is a test string";
		String output = reverse(input);
		System.out.println(output);
		
		String output1 = reverseChar(input);
		System.out.println(output1);
		
	}
	/*
	public static String reverse(String input) {
		String reverse = "";
		String[] array = input.split(" ");
		for (int i = array.length-1; i >= 0; i--) {
			reverse+= array[i] + " ";
		}	
		return reverse;
	}
	*/
	
	public static String reverse(String input) {
		String reverse = "";
		
		if (input.isEmpty() || input == null) {
			System.out.println("Empty and null strings are not accepted!.");
		}
		
		if (input.length() <= 1) {
			reverse = input;
		} else {
			String[] originalArray = input.split("\\s+");
			
			for (String item: originalArray) { //this, is, a, test, string
				reverse = item + " " + reverse;
			}
		}	
		return reverse.trim();
	}
	
	public static String reverseChar(String input) {
		String reverse = "";
		for (int i=0; i < input.length(); i++) {
			reverse = input.charAt(i) + " " + reverse;
		}
		return reverse;
		
	}
	
}
