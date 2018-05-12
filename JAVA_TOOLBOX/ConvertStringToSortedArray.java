import java.util.Arrays;

public class ConvertStringToSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testString = "xannfplmgrmnnbbaaccaabb";
		
		char[] modified = convertStringToSortedArray(testString);
		
		for (int i = 0; i < modified.length; i++) {
			System.out.println(modified[i]);
		}
	}
	
    public static char[] convertStringToSortedArray(String inputString)
    {
    	// NOTE: This program works for only lowercase letters in it's current form... 
    	
        // convert input string to an array of characters (char)
        char modifiedArray[] = inputString.toCharArray();
         
        // sort the modifiedArray
        Arrays.sort(modifiedArray);
         
        return (modifiedArray);
    }

}
