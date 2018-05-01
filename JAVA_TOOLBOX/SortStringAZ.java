package main;
import java.util.Arrays;



public class SortStringAZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String testString0 = "cabca";
		
		System.out.println( sortStringAZ(testString0));
	}
	
	
	// Method to sort a string from a to Z
    public static String sortStringAZ(String inputString)
    {
        // convert input string to an array of characters (char)
        char modifiedArray[] = inputString.toCharArray();
         
        // sort the modifiedArray
        Arrays.sort(modifiedArray);
         
        return new String(modifiedArray);
    }
     

}
