	
  public static void main(String[] args) throws IOException {


		
		
		// TEST with 10 
		
		int fun = stringIntToBinary("10");
		
		
		System.out.println("\n FUN value is---> : " + fun);
		
	// end of the main driver method... 
	}
  
  
  
  public static int stringIntToBinary( String s) {
		
		boolean debug = true; 
		
		// make an integer representing a base 2 version of a string which represents a base 2 number
		
		LinkedList<Integer> b2 = new LinkedList<Integer>();
		
		
		int b10 = Integer.parseInt(s);
		

		if ( debug ) System.out.println("The current value of b10 is: " + b10 );

		
		int currentPlace = findHighestBase2(b10);
		
		

		while ( b10 >= 0 ) {
			
			if ( debug ) {
				System.out.println("\nThe current value of b10 is: " + b10 );
				System.out.println("The current place is: " + currentPlace );
			}
			
			
			if ( currentPlace  <= 1) {
				
				if ( debug ) {
					
					System.out.println("\n\nWARNING -----> Break area...");
					System.out.println("The value of b10 is: " + b10);
				}
		
				
				if (b10 == 1) {
					b2.add(1);
				} else {
					b2.add(0);
				}
				
				break;
			}
			
			
			
			if ( currentPlace <= b10 )  {
				
				if ( debug ) System.out.println("ADDING  A 1 to the end of the list.... ");
				b2.add(1);
				
				b10 -= currentPlace; 
				
				
				
				
			} else {
				
				if ( debug ) System.out.println("ADDING  A 0 to the end of the list.... ");
				
				b2.add(0);
			}
			currentPlace /= 2; 
		}
		
	 
		if ( debug) System.out.println("The current value of b2 is now.... " + b2 );
	
		
		String data = "";
		
		for (int i = 0; i < b2.size(); i++) {
			data += b2.get(i);
		}
		// todo 
		return Integer.parseInt(data);
		
	// end of the the stringIntToBinary function 	
	}
	
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
