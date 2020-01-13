
public class BinaryTreeMaximumPathSum {
	int max = Integer.MIN_VALUE;
	public int maxPathSum(TreeNode root) {
		maxPathSumExecute(root);
		return max;
    }
	
	public int maxPathSumExecute(TreeNode root) {
		if(root ==null){return 0;}
		
		int leftsum = Math.max(0,maxPathSumExecute(root.left));
		int rightsum = Math.max(0,maxPathSumExecute(root.right));
		
		max = Math.max(max, leftsum+rightsum+root.val);
		return Math.max(leftsum, rightsum)+root.val;
    }
}
