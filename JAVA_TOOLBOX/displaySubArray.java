	public static void displaySubArray(int [] arr, int start, int stop) {
		
		int L = arr.length; 
		
		if ( stop >= L) stop = L - 1; 
		
		System.out.print("\n[ ");
		
		for (int i = start; i <= stop; i++) {
			if (i == L - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		
		System.out.print(" ]\n");
	}
	
