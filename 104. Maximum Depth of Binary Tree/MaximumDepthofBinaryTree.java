
public class MaximumDepthofBinaryTree {
//	public int maxDepth(TreeNode root) {
//        return maxDepthhelper(root,0);
//    }
//	public int maxDepthhelper(TreeNode root, int premax) {
//		if(root == null){
//			return premax;
//		}
//		int max = 0;
//			max = Math.max(max,maxDepthhelper(root.left,premax+1));
//			max = Math.max(max,maxDepthhelper(root.right,premax+1));
//        return max;
//    }
	
	public int maxDepth(TreeNode root) {
		if(root ==null){
			return 0;
		}
	  return Math.max(maxDepth(root.left)+1,maxDepth(root.right)+1);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
