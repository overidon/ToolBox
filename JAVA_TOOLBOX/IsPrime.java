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
	}
	
	
	public static boolean isPrime(int input	){
		
		// this caveat can be contested as the definitions of Mathematics expand over time...
		// but for now this is fine
		if (input < 2) {
			
			return (false);
		}
		
		
		for (int i = 2; i < 13; i++){
			
			if (input > i){
				
				// this module check will see if the number is divisible by a basic natural number...
				// note how this check makes sure that the loop iterator of 'i' isn't larger or equal to..
				// the input itself....

				System.out.println("Input modulo i of: " + i + " is: " + (input % i));
						
				if (input % i == 0){
					return (false);
				}
			}
		}
		
		// if a number can make it through the sieve without returning false it is true
		return (true);
	}

}
