
public class HouseRobberIII {
	public int rob(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int value = root.val;
        
        if(root.left!=null){
            value += (rob(root.left.left) + rob(root.left.right));
        }
        
        if(root.right!=null){
            value += (rob(root.right.left) + rob(root.right.right));
        }
        
        return Math.max(rob(root.left)+rob(root.right),value);
    }
}
