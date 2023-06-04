import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		String s = "rat", t = "car";
		boolean ok = isAnagram(s, t);
		System.out.println(ok);
	}
	
	public static boolean isAnagram(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		if (s.length() == t.length()) {
			for (int i = 0; i < s.length(); i++) {
				if (!map.containsKey(s.charAt(i))) {
					if (charOccurence(s, s.charAt(i)) != charOccurence(t, s.charAt(i))) {
						return false;
					}
					map.put(s.charAt(i), ' ');
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	public static int charOccurence(String s, char c) {
		int i = 0, charPosition;
		int occ = 0;
		do {
			charPosition = s.indexOf(c, i);
			if (charPosition >= 0) {
				i = charPosition + 1;
				occ++;
			}
		} while (charPosition >= 0);
		return occ;
	}

}
