	public static int findHighestBase2(int n) {
		
		int power = 0;
		
		int result = 0; 
		
		for (int i = 1; i < n; i++  ) {
			
			int temp = (int) Math.pow(2, power);
			
			System.out.println("TEMP is: " + temp);
			
			if ( temp <= n)  {
				System.out.println(" The number " + n + " is base 2 potential digit...");
				
				result =  temp; 
			} 
			
			power++;
		}
		
		return result; 
	}
