package main;

public class ScanForLetters {

	public static void main(String[] args) {
		
		
		//String testString =  "x20891";
		String testString1 = "xandium";
		
		System.out.println(scanForLetters(testString1));
	}
	
	static boolean scanForLetters(String name) {
		
		// letters OK
		// anything else will return false
		
		int nameLength = name.length();
		
		System.out.println(name);
		
		for (int i = 0; i < nameLength; i++ ) {
			
			if ( !Character.isLetter(name.charAt(i)) ) {
				
				System.out.println(" fail at letter i of: " + name.charAt(i));
				return  (false);
			}
	
		}
		
		
		System.out.println("Only letters were found... returning true now... " );
		return (true);
	}

}
