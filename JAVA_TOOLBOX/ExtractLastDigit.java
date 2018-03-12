package main;

public class ExtractLastDigit {

	public static void main(String[] args) {
		// This will attempt to extract the last digit of a non-zero && positive integer...

		
		System.out.println(extractLastDigit (1776));
	}
	
	static int extractLastDigit(int n) {
		
		String cloneN = Integer.toString(n);
		
		int lastDigit = Character.getNumericValue(cloneN.charAt(cloneN.length()-1)) ;
					
		return lastDigit;
		
	}

}
