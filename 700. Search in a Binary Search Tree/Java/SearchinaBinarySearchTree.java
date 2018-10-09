
public class SearchinaBinarySearchTree {
	
	public TreeNode searchBST(TreeNode root, int val) {
	        if (root.val == val){
	            return root;
	        }
	        else{
	        	TreeNode leftresult =(root.left==null)?null: searchBST(root.left,val);
	            TreeNode rightresult = (root.right==null)?null:searchBST(root.right,val);
	            
	            if (leftresult!=null){
	                return leftresult;
	            }
	            if (rightresult!=null){
	                return rightresult;
	            }
	            return null;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
