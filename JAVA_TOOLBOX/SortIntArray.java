package main;

import java.util.Arrays;

public class SortIntArray {

	public static void main(String[] args) {
		
		// this is a test data set
		int [] testArray = {5, 13, 68, 77, 9, -18, 42, 1089, -77, 0, 11, 1};
		
		// call the sortIntArray function 
		sortIntArray(testArray);
	}
	
	static int[] sortIntArray( int[] inputArray) {
		
		// duplicate the original array in case the original is needed for checking against later for consistency...
		int [] modifiedArray = inputArray;
		
		// Determine the length of the array -> original or modified are both OK in this case
		int arrayLength = inputArray.length;
		
		// print a description 
		System.out.println("ORIGINAL");
		
		// Loop through and print the array prior to sorting...for reference
		for (int i = 0; i < arrayLength; i++ ) {
			System.out.print(Integer.toString(modifiedArray[i] ) + ", ");
		}
		
		// Call the sorting function on the modified array
		Arrays.sort(modifiedArray);
		
		// print an empty line for readability
		System.out.println("");
		
		// print a description 
		System.out.println("MODIFED");
		// Loop through and print the sorted array... for reference
		for (int i = 0; i < arrayLength; i++ ) {
			System.out.print(Integer.toString(modifiedArray[i] ) + ", ");
		}
		
		// return the modified array 
		return (modifiedArray);
	}

}
