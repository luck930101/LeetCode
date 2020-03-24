
public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
        return (depth(root)==-1)?false:true;
    }
    
    public int depth(TreeNode root) {
        if(root == null){return 0;}
        
        int leftdepth = depth(root.left);
        if(leftdepth==-1){return -1;}
        
        int rightdepth = depth(root.right);
        if(rightdepth==-1){return -1;}
        
        if(Math.abs(leftdepth-rightdepth)>1){
            return -1;
        }
        else{
            return Math.max(leftdepth,rightdepth)+1;
        }
         
    }
}
