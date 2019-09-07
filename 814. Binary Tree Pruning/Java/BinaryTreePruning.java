
public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
    	if (root==null){
    		return null;
    	}
    	
    	TreeNode result = root;
        
        root.left = pruneTree(root.left);
    	root.right = pruneTree(root.right);
        
        if (root.val ==0 && root.left==null && root.right==null){		
    		result = null;
    	}

        return result;
    }
}
