
public class DiameterofBinaryTree {
	
	int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
    	
    	if (root == null){
    		return 0;
    	}
    	diameterOfBinaryTreehepler(root);
    	return max;

    }

    public int diameterOfBinaryTreehepler(TreeNode root) {
    	
    	if (root == null){
    		return 0;
    	}

    	
    	int leftpath = diameterOfBinaryTreehepler(root.left);
    	int rightpath = diameterOfBinaryTreehepler(root.right);
    	
    	max = Math.max(leftpath+rightpath,max);
    	
    	return Math.max(leftpath,rightpath)+1;
    }
}
