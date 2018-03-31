package main;

public class ArraySetup2D {

	public static void main(String[] args) {

		//int [] testArray = {-1000, 0, -2, 0};
		
		int [] testArray2 = {2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};
		
		arrayChange(testArray2);
	}
	
	static int arrayChange(int[] inputArray) {
		
		int [] mArray = inputArray;
		
		int arrayLength = mArray.length;
		
		int moves = 0;
		
		int currentMove = 0;
		
		
		for (int columns = 0; columns < arrayLength; columns++) {
			
			System.out.print(mArray[columns] + ", ");
			
		}
		
		
		
		for (int columns = 0; columns < arrayLength - 1; columns++) {
			
			if (mArray[columns + 1] <= mArray[columns]) {
				
				currentMove += mArray[columns] - mArray[columns + 1] + 1;
				
				mArray[columns + 1] += currentMove;
				
				moves += currentMove;
				
				currentMove = 0;
			}
			//System.out.print(mArray[columns] + ", ");
			
		}
		
		System.out.println(" ");
		
		
		for (int columns = 0; columns < arrayLength; columns++) {
			
			System.out.print(mArray[columns] + ", ");
			
		}
		
		System.out.println(" ");
		
		System.out.println(moves);
		return (moves);
	}

}
