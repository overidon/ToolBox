	  public static void display2DArray(int[][] arr) {

		  for (int row = 0; row < arr.length; row ++ ){
			  
			  System.out.print("\n[ ");
				
				for (int i = 0; i < arr[0].length; i++) {
					if (i == arr.length - 1) {
						System.out.print(arr[row][i]);
					} else {
						System.out.print(arr[row][i] + ", ");
					}
				}
				
				System.out.print(" ]\n");
		  }	
		}
