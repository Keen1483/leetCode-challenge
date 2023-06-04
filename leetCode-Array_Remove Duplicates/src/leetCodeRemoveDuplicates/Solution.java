package leetCodeRemoveDuplicates;

public class Solution {
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int[] nums1 = {1,1,2};
		int count = removeDuplicates(nums);
		System.out.println(count);
	}
	
	public static int removeDuplicates(int[] nums) {
		int j;
        for (int i = 0; i < nums.length; i++) {
        	j = i + 1;
        	while (j < nums.length && nums[i] == nums[j]) {
        		nums[j] = -200;
        		j++;
        	}
        	i = j - 1;
        }
        
        int k = 0, count = 1, i = 1;
        while (i < nums.length) {
        	if (nums[i] != -200) {
        		k++;
        		nums[k] = nums[i];
        		count++;
        	}
        	i++;
        }
        int l = count;
        while (l < nums.length) {
        	nums[l] = -200;
        	l++;
        }
        System.out.println(displayArr(nums));
        
        return count;
    }
	
	public static String displayArr(int[] arr) {
		String str = "[";
		for (int i=0; i<arr.length; i++) {
			str += " " + arr[i];
		}
		str += " ]";
		return str;
	}
}
