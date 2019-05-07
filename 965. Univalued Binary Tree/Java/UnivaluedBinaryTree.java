
public class UnivaluedBinaryTree {
	
	public boolean isUnivalTree(TreeNode root) {
		
		return isUnivalTreeHelper(root,root.val);
		
    }
	
	public boolean isUnivalTreeHelper(TreeNode root, int target) {
		
		if(root ==null){
			return true;
		}
		
		if(root.val != target){
			return false;
		}
		
		
		
        return isUnivalTreeHelper(root.left,target) && isUnivalTreeHelper(root.right,target);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
