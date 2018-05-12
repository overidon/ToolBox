package main;

public class DetermineCharOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "cheddar"

		determineCharOccurances("cheddar", 'd');
	}
	
	static int determineCharOccurances(String inputString, char targetChar) {
		

		int stringLength = inputString.length();
		
		System.out.println(inputString);
		
		int targetCharOccurances = 0;
		
		for (int index = 0; index < stringLength; index++ ) {
			
			if ( inputString.charAt(index) == targetChar) {
				targetCharOccurances++;
			}
	
		}
		
		
		System.out.println("The number of occurances of: '" + targetChar + "' in: "  + inputString + " is: " + targetCharOccurances);
		return (targetCharOccurances);
	}

}
