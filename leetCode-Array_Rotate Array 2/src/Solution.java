import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		rotate(nums, 51);
	}
	
	public static void rotate(int[] nums, int k) {
		List<Integer> listNums = Arrays.stream(nums).boxed().collect(Collectors.toList());
		k %= nums.length;
		if (k != 0) {
			int firstIndex = nums.length - k;
			int j = 0;
			for (int i = firstIndex; i < nums.length; i++, j++) {
				nums[j] = listNums.get(i);
			}
			for (int i = 0; i < firstIndex; i++, j++) {
				nums[j] = listNums.get(i);
			}
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
