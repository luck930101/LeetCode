
public class LeafSimilarTrees {
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		String tree1sequence = stringBuild(root1);
		String tree2sequence = stringBuild(root2);
		return tree1sequence.equals(tree2sequence);
        
    }

	public String stringBuild(TreeNode node){
		String sequence = "";
		if (node.left==null&&node.right==null){
			return String.valueOf(node.val);
		}
		if(node.left!=null){
			sequence+=stringBuild(node.left);
		}
		if(node.right!=null){
			sequence+=stringBuild(node.right);
		}
		return sequence;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
