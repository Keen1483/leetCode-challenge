
public class Solution {

	public static void main(String[] args) {
		int[] nums = {2,2,1};
		int[] nums2 = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
		System.out.println(singleNumber(nums2));
	}
	
    public static int singleNumber(int[] nums) {
        int k = 0;
        Integer dupl;
        while (k < nums.length) {
        	dupl = null;
        	for (int i = 0; i < nums.length; i++) {
        		if (i != k) {
        			if (nums[i] == nums[k]) {
        				dupl = nums[i];
        			}
        		}
        	}
        	if (dupl == null) {
        		return nums[k];
        	}
        	k++;
        }
        return 0;
    }

}
