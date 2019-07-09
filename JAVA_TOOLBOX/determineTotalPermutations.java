	public static int determineTotalPermutations ( int totalDigits, int setSize  ) {
		
		/*
		 *  This function will take the number of the elements in a set of numbers or letters etc...
		 *  
		 *  the amount of elemnents in that set to the power of the total number of digits or allowable elements...
		 *  will become the total number of permutations 
		 *  
		 *  THUS ->  "874" -> Has 3 digits -> if each element has 2 values -> 8 -> ["G", "H"] etc
		 *  The total number of permuations would be 2 to the power of 3 -> RETURN 8 
		 * 
		 */
		
		
		return (int) Math.pow( setSize, totalDigits);
		
	// end of the determineTotalPermutations method 
	}
