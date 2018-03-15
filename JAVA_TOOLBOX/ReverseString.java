package main;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println(reverseString("canyoureverseme?"));

	}
	
	
	static String reverseString (String inputString) {

		// Create a new string that is the reverse of the original string
	    String reversedString = new StringBuilder(inputString).reverse().toString();
		
	    // Send the original string to the console for comparison.. comment out as necessary
		System.out.println(inputString);
		
		// return the reversedString-->
		return(reversedString);
		
	}

}
