
public class Solution {

	public static void main(String[] args) {
		int[] digits = {7,2,8,5,0,9,1,2,0,9};
		int[] digits2 = {6,9,9};
		long nbr = 9_223_372_036_854_775_807L;
		int[] result = plusOne(digits);
		System.out.println(displayArray(result));
	}
	
	public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0 && digits[i] + 1 == 10) {
        	digits[i] = 0;
        	i--;
        }
        if (i != -1) {
        	digits[i] += 1;
        } else {
        	int[] result = new int[digits.length + 1];
        	result[0] = 1;
        	for (int j = 0; j < digits.length; j++) {
        		result[j + 1] = digits[j];
        	}
        	return result;
        }
        return digits;
    }
	
	public static String displayArray(int[] array) {
		String str = "[ ";
		for (int i = 0; i < array.length; i++) {
			str += " " + array[i];
		}
		str += " ]";
		return str;
	}

}
