package strings;

public class AllUniqueChars {

/*
 * Check if the last index of each character of the string is the first index.
 */

static boolean hasUniqueChars(String s){	
	char tempChar ;
	for(int index = 0; index < s.length() ; index++){
		tempChar = s.charAt(index);
		if(!(s.lastIndexOf(tempChar) == index)){
			return false ;
		}
	}
	return true;
}
	
	public static void main(String[] args) {
		String s = "abcc";
		System.out.println(hasUniqueChars(s));

	}

}
