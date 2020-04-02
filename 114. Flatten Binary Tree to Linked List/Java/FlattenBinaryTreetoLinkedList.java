
public class FlattenBinaryTreetoLinkedList {
	public void flatten(TreeNode root) {
        if(root==null){return;}
        TreeNode left = root.left;
        TreeNode right = root.right;
        

        
        flatten(left);
        flatten(right);

        root.right = left;
        
        TreeNode current = root;
        while(current.right!=null){
            current = current.right;
        }
        current.right = right;
        root.left = null;
    }
}	
