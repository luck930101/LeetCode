
public class BinarySearchTreetoGreaterSumTree {

    public TreeNode bstToGst(TreeNode root) {
    	int[] numberset = new int[101];
    	addToArray(root, numberset);
    	caculate(root,numberset);
    	return root;
    }
    public void addToArray(TreeNode root, int[] numberset) {
    	if (root ==null){
    		return;
    	}
    	else{
    		numberset[root.val] = root.val;
    	}
    	addToArray(root.left, numberset);
    	addToArray(root.right, numberset);
    	
    }
    
    public void caculate(TreeNode root, int[] numberset) {
    	if (root ==null){
    		return;
    	}
    	else{
    		for(int i = root.val+1; i<=100;i++){
    			root.val+=numberset[i];
    		}
    	}
    	caculate(root.left, numberset);
    	caculate(root.right, numberset);
    	
    }
    
}
