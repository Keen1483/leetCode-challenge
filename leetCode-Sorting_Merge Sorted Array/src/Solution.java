import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		merge(nums1, 3, nums2, 3);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        
        for (int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        
        nums1 = list.stream().mapToInt(i -> i).toArray();
        
        System.out.println(displayArray(nums1));
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
