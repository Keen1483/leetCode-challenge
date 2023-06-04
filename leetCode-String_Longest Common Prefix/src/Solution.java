
public class Solution {

	public static void main(String[] args) {
		String[] strs = {"ab","a"};
		String prefix = longestCommonPrefix(strs);
		System.out.println(prefix);
	}
	
	public static String longestCommonPrefix(String[] strs) {
	    String commonPrefix = "";
	    int i = 0, j = 0;
	    boolean stop = false;
	    int least = strs[0].length();
	    for (int k = 0; k < strs.length; k++) {
	    	if (least > strs[k].length()) {
	    		least = strs[k].length();
	    	}
	    }
	    while (!stop && j < least) {
	    	while (i < strs.length - 1 && strs[i].charAt(j) == strs[i+1].charAt(j)) {
	    		i++;
	    	}
	    	if (i == strs.length - 1) {
	    		commonPrefix += strs[i].charAt(j);
	    		i = 0;
	    		j++;
	    	} else {
	    		stop = true;
	    	}
	    }
	    return commonPrefix;
	}

}
