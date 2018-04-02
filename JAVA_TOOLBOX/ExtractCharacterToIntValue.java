package main;

public class ExtractCharacterToIntValue {

	public static void main(String[] args) {
		// 2018 -> Tyler Jaggers
		// Overidon Omnimedia
		// MIT License 
		
		
		String testString = "aaxbcdzzy";
		
		System.out.println(extractCharacterToIntValue(testString));
	}
	
	static int extractCharacterToIntValue(String inputString) {
		
		int totalValue = 0;

		// Loop through and print the entire string for testing...
		for (int column = 0; column < inputString.length(); column ++) {
			
			System.out.print(inputString.charAt(column));
		}
		
		System.out.println(" ");
		
		// Loop through and print the value of each lower-case letter for testing...
		for (int column = 0; column < inputString.length(); column ++) {
			
			System.out.print(inputString.charAt(column) + " -> " + Integer.toString(inputString.charAt(column) - 'a' ));
			
			System.out.println(" ");
			
			totalValue += inputString.charAt(column) - 'a';
		}
		
		return (totalValue);
	}

}
