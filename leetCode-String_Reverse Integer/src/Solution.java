
public class Solution {

	public static void main(String[] args) {
		int x = -2147483648;
		System.out.println(reverse(x));
	}
	
	public static int reverse(int x) {
		long upperBound = 2147483647L;
		long lowerBound = -2147483648L;
		char[] s;
		long reverseX, temp;
		if (x < 0) {
			temp = (long) x * (-1);
			s = String.valueOf(temp).toCharArray();
			reverseX = Long.parseLong(reverseString(s));
			reverseX *= -1;
		} else {
			s = String.valueOf(x).toCharArray();
			reverseX = Long.parseLong(reverseString(s));
		}
		
		if (lowerBound <= reverseX && reverseX <= upperBound) {
			return (int) reverseX;
		} else {
			return 0;
		}
	}
	
	public static String reverseString(char[] s) {
	    char temp;
	    int k = (int) Math.floor(s.length / 2) - 1;
	    for (int i = s.length - 1, j = 0; i > k && j <= k; i--, j++) {
	    	temp = s[j]; s[j] = s[i]; s[i] = temp;
	    }
	    return new String(s);
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
