
public class Solution {

	public static void main(String[] args) {
		String s = "+20000000000000000000";
		String haystack = "leetcode", needle = "leeto";
		System.out.println(haystack.indexOf(needle));
	}
	
    public static int myAtoi(String s) {
    	final long upperBound = 2147483647L;
		final long lowerBound = -2147483648L;
		long sContent;
    	String sign = "+", result;
    	int i = 0;
    	if (s.trim().equals("")) {
    		return 0;
    	}
    	while (s.charAt(i) == ' ') {
    		i++;
    	}
    	if (s.charAt(i) == '-' || s.charAt(i) == '+') {
    		sign = String.valueOf(s.charAt(i));
    		i++;
    	}
    	result = sign;
    	while (i < s.length() && String.valueOf(s.charAt(i)).matches("[0-9]")) {
    		result += String.valueOf(s.charAt(i));
    		i++;
    	}
    	if (result.equals(sign)) {
    		return 0;
    	}
    	sContent = Long.parseLong(result);
    	if (lowerBound <= sContent && sContent <= upperBound) {
			return (int) sContent;
		} else if (sContent < lowerBound) {
			return (int) lowerBound;
		} else {
			return (int) upperBound;
		}
    }

}
