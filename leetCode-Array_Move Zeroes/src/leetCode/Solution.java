package leetCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {2,0,8,6,0,5,11,4,0,7};
		moveZeroes(nums);
	}
	
	public static void moveZeroes(int[] nums) {
		List<Integer> listNums = Arrays.stream(nums).boxed().collect(Collectors.toList());
		int j = 0;
		for (int i = 0; i < listNums.size(); i++) {
			if (listNums.get(i) != 0) {
				nums[j] = listNums.get(i);
				j++;
			}
		}
		while (j < nums.length) {
			nums[j] = 0;
			j++;
		}
		System.out.println(displayArray(nums));
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
