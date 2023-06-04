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
		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
		System.out.println(maxDepth(root));
	}
	
    public static int maxDepth(TreeNode root) {
        
    	int depth = 0;
    	
    	if (root == null) {
    		return 0;
    	}
    	
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.add(root);
    	
    	while(!queue.isEmpty()) {
    		int size = queue.size();
    		
    		while(size > 0) {
    			root = queue.remove();
    			
    			if(root.left != null) {
    				queue.add(root.left);
    			}
    			
    			if(root.right != null) {
    				queue.add(root.right);
    			}
    			
    			size--;
    		}
    		depth++;
    	}
    	
    	return depth;
    }

}
