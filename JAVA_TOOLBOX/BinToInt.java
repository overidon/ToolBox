package main;

public class BinToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test0 = "1010";   /// --> expected 10
		String test1 = "111110100"; // expected 500
		System.out.println( binToInt( test1 ));
	}
	
	public static int binToInt (String binary) {
		
		int place = 1;
		
		int number = 0;
		
		
		for (int i = binary.length() - 1; i >= 0; i-- ) {
			
			
			System.out.println("Unit: " + place  + "'s ... is: " + binary.charAt(i) );
			
			
			
			number += place * ( Integer.parseInt( "" + binary.charAt(i) ) );
			
			System.out.println("The number so far is: " + number);
			
			place *= 2;
			
			
		}
		
		
		
		return number;
		
	}

}
