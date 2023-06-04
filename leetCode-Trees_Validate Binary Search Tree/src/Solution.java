import java.util.LinkedList;
import java.util.Queue;

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
		TreeNode root = new TreeNode(3, new TreeNode(2), new TreeNode(20, new TreeNode(15), new TreeNode(21)));
		System.out.println(isValidBST(root));
	}
	
    public static boolean isValidBST(TreeNode root) {
    	
    	return validate(root, null, null);
    }
    
    public static boolean validate(TreeNode root, Integer low, Integer high) {
        // Empty trees are valid BSTs.
        if (root == null) {
            return true;
        }
        // The current node's value must be between low and high.
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }
        // The left and right subtree must also be valid.
        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }

}
