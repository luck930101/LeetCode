
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    	if(t1==null && t2==null){
    		return null;
    	}
    	TreeNode newnode = new TreeNode((t1==null?0:t1.val)+(t2==null?0:t2.val));
    	newnode.left = mergeTrees((t1.left==null?null:t1.left),(t2.left==null?null:t2.left));
    	newnode.right = mergeTrees((t1.right==null?null:t1.right),(t2.right==null?null:t2.right));
    	return newnode;
    }
    
    


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
