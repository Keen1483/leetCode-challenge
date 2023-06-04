
public class Solution {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		boolean ok = isPalindrome(s);
		System.out.println(ok);
	}
	
	public static boolean isPalindrome(String s) {
	    s = s.toLowerCase()
	    		.replaceAll("[^a-z0-9]", "");
	    System.out.println(s);
	    int k = (int) Math.floor(s.length() / 2) - 1;
	    for (int i = s.length() - 1, j = 0; i > k && j <= k; i--, j++) {
	    	if (s.charAt(i) != s.charAt(j)) {
	    		return false;
	    	}
	    }
	    return true;
	}

}
