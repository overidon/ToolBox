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
	
	// this is a more raw version where I'm converting the String into a char array manually and then
	// putting the char array into a new String directly... it has significant performance benefit over concatentation 
	public static String reverseString_01A(String input){
		
		
		char [] array = new char[input.length()];
		
		for (int i = 0 ; i < input.length(); i++){
			
			array[input.length() - i - 1] = input.charAt(i); 
		}
		
		return new String(array);
	}

}
