package main;

public class ArraySetup2D {

	public static void main(String[] args) {
		

		prepare2DArrayManually();
		
		prepare2DArrayWithInt(4, 10);
	}
	
	static int[][] prepare2DArrayManually() {
		
		// NOTE: the manual way of preparing a 2D array is good for situations where the programmer already knows...
		// the dimensions and values for the array
		
		int [][] matrix2D = {{1, 4, 1}, 
                			{0, 7, 8}, 
                			{3, 5, 2}};
		
		
		int maxRows = matrix2D.length;
		int maxColumns = matrix2D[0].length;
		
		for (int column = 0; column < maxColumns; column++){
			for (int row = 0; row < maxRows; row++){	
				
				System.out.print(matrix2D[row][column]);
				
			}
			
			System.out.println("");
			
		}
		
		System.out.println("");
		
		// but as you can see it is not very "functional" in terms of recursion...
		// ... it will always output what it is initialized to unless it's modified
		return (matrix2D);
		
	}
	
	
	static int[][] prepare2DArrayWithInt(int rows, int columns){
		
		int[][] matrix2D = new int[columns][rows];
		
		
		int maxRows = matrix2D.length;
		int maxColumns = matrix2D[0].length;
		
		for (int column = 0; column < maxColumns; column++){
			for (int row = 0; row < maxRows; row++){	
				
				System.out.print(matrix2D[row][column]);
				
			}
			
			System.out.println("");
			
		}
		
		
		System.out.println("");
		return ( matrix2D );
		
	}

}
