	public static boolean verify2DArraysIdentical( char[][] a, char[][]b ) {
		
		// This function verifies returns true if all of their values are identical. 
		
		for (int row = 0; row < a.length; row++) {
			
			for (int col = 0; col < b.length; col++) {
				
				if ( a[row][col] != b[row][col]) return false; 
			}
		}
		
		return true; 
		
	// end of verify2DArraysIdentical 
	}
