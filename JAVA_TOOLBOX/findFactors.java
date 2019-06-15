	public static LinkedList<Integer> findFactors(int n) {
		
		LinkedList<Integer> factors = new LinkedList<Integer>();
		
		while (n > 1) {
			
			System.out.println("The value of n is: " + n);
			
			if ( n % 2 == 0) {
				factors.add(2);
				n = n / 2; 
			} else {
				
				System.out.println("odd number found...");
				
				for (int i = 3; i < n ; i++) {
					
					if ( n % i == 0) {
						
						System.out.println("The value of i is: " + i);
						System.out.println("The value of n is: " + n);
						factors.add(i);
						n = n / i;
						
					}
				}
				
				factors.add(n);
				n = n / n;
	
			}
			
			
		}
		
		return factors;
		
	}
