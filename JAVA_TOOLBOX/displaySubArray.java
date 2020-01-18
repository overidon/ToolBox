	public static void displaySubArray(int [] arr, int start, int stop) {
		
		System.out.print("\n[ ");
		
		for (int i = start; i <= stop; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		
		System.out.print(" ]\n");
	}
	
