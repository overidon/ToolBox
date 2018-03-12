package main;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(digitSum (1776));
	}
	
	static int digitSum(int n) {
		
		String cloneN = Integer.toString(n);
		int digitSum = 0;
		
		for (int i = 0; i < cloneN.length(); i++){
			
			System.out.println(cloneN.charAt(i));
			
			digitSum += Character.getNumericValue(cloneN.charAt(i));
		}
		
		
		return digitSum;
		
	}

}
