
public class Solution {

	public static void main(String[] args) {
		int[] nums = {3,3};
		int[] sum = twoSum(nums, 6);
		System.out.println(displayArray(sum));
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < nums.length; i++) {
        	for (int j = i + 1; j < nums.length; j++) {
        		if (i != j) {
        			if (nums[i] + nums[j] == target) {
        				sum[0] = i;
        				sum[1] = j;
        				break;
        			}
        		}
        	}
        }
        return sum;
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
