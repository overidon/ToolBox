	public static void fill2DArray(int[][] arr) {
		
	  for (int row = 0; row < arr.length; row ++ ){
			  
		  
			
		for (int col = 0; col < arr[0].length; col++) {
				
			
			int item = (int) (Math.random() * 2);
			
			arr[row][col] = item;
		}	
	  }	
	}
