package interviewquestions;

import java.util.Scanner;

public class ReverseChars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String original = scan.nextLine();
		
		while (original.isEmpty() || original == null) {
			System.out.println("Please enter a valid string");
			original = scan.nextLine();
		}
		scan.close();
		
		ReverseChars output = new ReverseChars();
		String reverseCharacters = output.reverseCharacters(original);
		System.out.println(reverseCharacters);

	}
	
	private String reverseCharacters(String originalStr) {
		String reverse = "";
		
		for (int i = originalStr.length()-1; i >= 0; i--) {
			reverse = reverse + originalStr.charAt(i);
		}
		return reverse;
	}

}
