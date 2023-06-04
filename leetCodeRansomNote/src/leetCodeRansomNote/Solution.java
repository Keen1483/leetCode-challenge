package leetCodeRansomNote;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		String ransomNote = "aaat", magazine = "aabajhdfhvtf";
		boolean resp = canConstruct(ransomNote, magazine);
		System.out.println(resp);
	}
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		List<Integer> used = new ArrayList<>();
		if (ransomNote.length() > magazine.length()) {
			return false;
		}
		int index;
		for (int i = 0; i < ransomNote.length(); i++) {
			index = magazine.indexOf(ransomNote.charAt(i));
			if (index == -1) {
				return false;
			} else {
				while (used.contains(index)) {
					if (index + 1 < magazine.length()) {
						index = magazine.indexOf(ransomNote.charAt(i), index+1);
						if (index == -1) {
							return false;
						}
					} else {
						return false;
					}
				}
				used.add(index);
			}
		}
		return true;
	}

}
