
public class Solution {

	public static void main(String[] args) {
		String s = "aabb";
		int index = firstUniqChar(s);
		System.out.println(index);
	}
	
	public static int firstUniqChar(String s) {
		int charOccurence = 0;
		for (int i = 0; i < s.length(); i++) {
			charOccurence = charOccurence(s, s.charAt(i));
			if (charOccurence == 1) {
				return i;
			}
		}
	    return -1;
	}
	
	public static int charOccurence(String s, char c) {
		int i = 0, charPosition;
		int occ = 0;
		do {
			charPosition = s.indexOf(c, i);
			if (charPosition >= 0) {
				i = charPosition + 1;
				occ++;
				if (occ >= 2) {
	                break;
	            }
			}
		} while (charPosition >= 0);
		return occ;
	}

}
