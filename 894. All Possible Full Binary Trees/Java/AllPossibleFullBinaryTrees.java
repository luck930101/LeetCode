import java.util.ArrayList;
import java.util.List;

public class AllPossibleFullBinaryTrees {
	public List<TreeNode> allPossibleFBT(int N) {
		
		List<TreeNode> list = new ArrayList<TreeNode>();
		
		if(N == 1){
			list.add(new TreeNode(0));
			return list;	 
		}
		
		for(int i = 1; i< (N-1)/2; i+=2){
			List<TreeNode> left = allPossibleFBT(i);
			List<TreeNode> right = allPossibleFBT(N-i-1);
			 for (TreeNode leftNode : left) {
                 for (TreeNode rightNode : right) {
                	 TreeNode node = new TreeNode(0);
                     node.left = leftNode;
                     node.right = rightNode;
                     list.add(node);
                	 
                 }
             }
			
		}
		
		return list;
        
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
