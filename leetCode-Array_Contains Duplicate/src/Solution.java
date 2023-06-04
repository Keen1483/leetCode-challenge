import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		int[] nums2 = {1,2,3,4};
		int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
		System.out.println(containsDuplicate(nums2));
		System.out.println(containsDuplicate(nums3));
	}
	
	public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
        	numsMap.put(nums[i], i);
        }
        System.out.println(numsMap);
        if (nums.length == numsMap.size()) {
        	return false;
        } else {
        	return true;
        }
    }

}
