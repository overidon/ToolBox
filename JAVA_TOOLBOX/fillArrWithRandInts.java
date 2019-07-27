	public static void fillArrWithRandInts(int[] arr) {
		
		// fill this array with random numbas 
		
		for (int i = 0; i < arr.length; i++) {
			
			int rand = (int) (Math.random() * 200 ) -100;
			arr[i] = rand;
		}
	// 
	}
