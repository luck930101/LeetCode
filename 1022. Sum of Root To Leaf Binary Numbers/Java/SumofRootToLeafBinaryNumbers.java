public class SumofRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
    	return sumRootToLeafHelper(root,0);
    }
    
    public int sumRootToLeafHelper(TreeNode root,int sum) {
    	if (root ==null){
    		return 0;
    	}
    	sum = sum*2+root.val;
    	
    	return root.left ==root.right ? sum:sumRootToLeafHelper(root.left,sum)+sumRootToLeafHelper(root.right,sum);
    }
}
