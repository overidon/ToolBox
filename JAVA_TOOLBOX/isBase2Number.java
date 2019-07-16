	public static boolean isBase2Number( int n ) {
		
		int power = 0;
		
		for (int i = 1; i < n; i++  ) {
			
			if ( Math.pow(2, power) == n)  {
				System.out.println(" The number " + n + " is base 2 potential digit...");
				
				return true; 
			}
		}
		
		return false; 
	}
