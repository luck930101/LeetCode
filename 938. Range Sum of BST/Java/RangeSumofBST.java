
public class RangeSumofBST {
	
	public int rangeSumBST(TreeNode root, int L, int R) {
        if(root ==null){
        	return 0;
        }
        
        if(root.val>= L &root.val<=R){
        	return root.val+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
        }
        else {
        	return root.val+rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R);
        }
		
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
