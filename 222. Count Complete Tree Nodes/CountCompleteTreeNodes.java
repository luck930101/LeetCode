
public class CountCompleteTreeNodes {
	//naive
	public int countNodes(TreeNode root) {
        if(root == null){return 0;}
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
	
	//binary search
}
