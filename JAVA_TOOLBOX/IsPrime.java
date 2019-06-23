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
		
		// loop through and see if any of these numbers are primes... then output the set
		LinkedList<Integer> primes = new LinkedList<Integer>();

		for (int i = 0; i < 200; i++){
			
			if ( isPrime(i)){
				System.out.println("\nIt is " + isPrime(i) + " that " + i + " is a prime number.\n");
				primes.add(i);
			} else {
				System.out.println(i + " is NOT PRIME...");
			}
			
		}
		
		System.out.println(primes);
		
	}
	
	
	public static boolean isPrime( int n ){
		
		if ( n <= 1) return false; 
				
		for (int i = 2; i <  (int) (n / 2) + 1; i++){
			if ( n % i == 0) return false;  
		}
		return true; 
	}

}
