package main;

public class DetermineDigitNumChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testString0 = "01_a_34dx";
		
		System.out.println(scanStringForDigit(testString0, 0));
		System.out.println(scanStringForLetter(testString0, 0));
		
		System.out.println(scanStringForDigit(testString0, 3));
		System.out.println(scanStringForLetter(testString0, 3));
		
		System.out.println(scanStringForDigit(testString0, 4));
		System.out.println(scanStringForLetter(testString0, 4));
	}
	
	static public boolean scanStringForDigit(String inputString, int stringLocation){
		System.out.println("");
		
		System.out.println("The String of: " + inputString + " at the location of: " + stringLocation + " is: " + inputString.charAt(stringLocation));
		
		if (   Character.isDigit(inputString.charAt(stringLocation))  ){
			
			System.out.println("It is a numerical digit.");

			return true;
		}
		
		System.out.println("It is not a numerical digit.");

		return false;
	}
	
	static public boolean scanStringForLetter(String inputString, int stringLocation){
		
		System.out.println("");
		
		System.out.println("The String of: " + inputString + " at the location of: " + stringLocation + " is: " + inputString.charAt(stringLocation));
		if (   Character.isLetter(inputString.charAt(stringLocation))  ){
			
			System.out.println("It is a letter.");
			return true;
		}

		System.out.println("It is not a letter.");
		
		return false;
	}

}
