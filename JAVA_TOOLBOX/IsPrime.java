/**
 * 
 */
package main;

/**
 * @author Tyler Jaggers
 *overidon omnimedia
 *6/6/2018 
 */
public class IsPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(isPrime(1));
		System.out.println(isPrime(17));
		System.out.println(isPrime(402));
	}
	
	
	public static boolean isPrime(int input	){
		
		if ( n < 2 ) return false; 
		
		for (int i = 2; i < n; i++) {
			if ( n  % i == 0 ) return false; 
		}
		
		return true;
	}

}
