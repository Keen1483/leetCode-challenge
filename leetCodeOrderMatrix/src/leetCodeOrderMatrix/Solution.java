package leetCodeOrderMatrix;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Solution {

	public static void main(String[] args) {
		int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
		int[][] mat2 = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
		int[] result = kWeakestRows(mat, 3);
		System.out.println(displayArr(result));
	}
	
	public static String displayArr(int[] arr) {
		String str = "[";
		for (int e : arr) str += e;
		str += "]";
		return str;
	}
	
	public static int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        List<Integer> list = new ArrayList<>();
        int i;
        int p = 0;
        int lower;
        while (p < k) {
        	i = 0;
        	while (list.contains(i) && i < mat.length) {
        		i++;
        	}
        	lower = i;
        	int low;
        	int[] comp = mat[i];
        	for (int j=0; j<mat.length; j++) {
        		if (!list.contains(j)) {
        			low = compare(comp, mat[j]);
        			if (low == -1) {
        				comp = mat[j];
        				lower = j;
        			}
        		}
        	}
        	result[p] = lower;
        	list.add(lower);
        	p++;
        }
        return result;
    }
	
	public static int compare(int[] arr1, int[] arr2) {
        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] == 0 && arr2[i] == 0) {
                return 1;
            }
            else if (arr1[i] == 0 && arr2[i] != 0) {
                return 1;
            }
            else if (arr1[i] != 0 && arr2[i] == 0) {
            	return -1;
            }
        }
        return 0;
    }

}
