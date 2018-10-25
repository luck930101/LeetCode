
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
        if(root == null){
        	return null;
        }
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        
		return root;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
