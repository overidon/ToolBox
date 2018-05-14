package main;

import java.util.Arrays;

public class FindArrayIntMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] testArray = {0, 42, 19, 16, 77, 18, 5, 6, 12};
		
		System.out.println(" The max is: " + findArrayIntMax(testArray));
	}
	
	public static int findArrayIntMax(int[] inputArray){
		
		int len = inputArray.length - 1;
		
		int [] modifiedArray = inputArray;
		
		Arrays.sort(modifiedArray);
		
		// Loop through and display just for fun....
		for (int index = 0; index < len; index++) {
			
			System.out.println("the modifed at loc is: " + modifiedArray[index]);
		}
		
		// TODO 
		return (modifiedArray[len]);
	}

}
