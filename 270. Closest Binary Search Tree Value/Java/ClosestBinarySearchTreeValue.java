
public class ClosestBinarySearchTreeValue {
	public int closestValueIterative(TreeNode root, double target) {
        double mindiff = Double.MAX_VALUE;
        int result = 0; 
        while(root!=null){
            double diff = Math.abs(root.val - target);
            if(diff < mindiff){
                mindiff = diff;
                result = root.val;
            }
            if(root.val >target){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        
        return result;
    }
	
	public int closestValueRecursive(TreeNode root, double target) {
        return closest(root, target, root.val);
    }
    
    private int closest(TreeNode node, double target, int val) {
        if (node == null) return val;
        if (Math.abs(node.val - target) < Math.abs(val - target)) val = node.val;
        if (node.val < target) val = closest(node.right, target, val);
        else if (node.val > target) val = closest(node.left, target, val);
        return val;
    }
}
