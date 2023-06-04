
public class Solution {

	public static void main(String[] args) {
		char[] s = {'H','a','n'};
		reverseString(s);
	}
	
	public static void reverseString(char[] s) {
	    char temp;
	    int k = (int) Math.floor(s.length / 2) - 1;
	    for (int i = s.length - 1, j = 0; i > k && j <= k; i--, j++) {
	    	temp = s[j]; s[j] = s[i]; s[i] = temp;
	    }
	    System.out.println(displayArray(s));
	}
	
	public static String displayArray(char[] array) {
		String str = "[ ";
		for (int i = 0; i < array.length; i++) {
			str += " " + array[i];
		}
		str += " ]";
		return str;
	}

}
