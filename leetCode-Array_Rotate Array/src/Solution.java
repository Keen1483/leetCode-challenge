
public class Solution {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		rotate(nums, 3);
	}
	
	public static void rotate(int[] nums, int k) {
		int i = 1;
		int lastItem;
		while (i <= k) {
			lastItem = nums[nums.length - 1];
			for (int j = nums.length - 1; j > 0; j--) {
				nums[j] = nums[j - 1];
			}
			nums[0] = lastItem;
			i++;
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
