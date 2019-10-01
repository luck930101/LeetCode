
public class FlipEquivalentBinaryTrees {
	
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
    	if(root1==null && root2==null){
    		return true;
    	}
    	if(root1==null || root2==null){
    		return false;
    	}
    	
    	if(root1.val!=root2.val){
    		return false;
    	}
        return flipEquiv(root1.left,root2.right)&&flipEquiv(root2.left,root1.right);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
