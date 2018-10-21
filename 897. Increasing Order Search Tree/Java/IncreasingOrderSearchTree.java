
public class IncreasingOrderSearchTree {
	public TreeNode increasingBST(TreeNode root) {
		if (root == null){
			return null;
		}
		
		TreeNode leftside = increasingBST(root.left);
		root.left = null;
		root.right = increasingBST(root.right);
		if(leftside!=null){
			TreeNode tail = leftside;
			while(tail.right!=null){
				tail = tail.right;
			}
			tail.right = root;
		}
		return leftside==null?root:leftside;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
