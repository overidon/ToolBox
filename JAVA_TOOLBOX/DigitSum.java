package main;

public class DigitSum {

	public static void main(String[] args) {

		System.out.println(digitSum (1776));
	}
	
	static int digitSum(int n) {
		
		if (n == 0) {
			return 0;
		}
		
		System.out.println("The last digit is: " + n % 10);
		System.out.println("Everything but the last digit is: " + n / 10);
		
		return (n % 10) + sumDigits(n / 10);
		
	}

}
