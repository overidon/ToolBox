public static HashSet<Integer> findFactors( int n){
		
	HashSet<Integer> factors = new HashSet<Integer>();

	for (int i = 1; i <= n; i++){
		if ( n % i == 0){
			factors.add(i);
		}
	}

	return factors; 

}
