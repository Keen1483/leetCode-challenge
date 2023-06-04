import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

class TreeNode {
	int val;
	TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
 	}
}

public class Solution {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int[] nums = list.stream().mapToInt(i -> i).toArray();
	}
	
    public boolean isSymmetric(TreeNode root) {
        
    	if (root == null) {
    		return true;
    	}
    	
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.add(root);
    	
    	while (!queue.isEmpty()) {
    		int size = queue.size();
    		
    		while (size > 0) {
    			root = queue.remove();
    			
    			if (root.left != null && root.right == null) {
    				return false;
    			} else if (root.left == null && root.right != null) {
    				return false;
    			}
    		}
    	}
    }

}
