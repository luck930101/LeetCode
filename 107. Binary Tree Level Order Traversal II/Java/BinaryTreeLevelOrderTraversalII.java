import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        recursive(root,result,0);
        return result;
    }
    
    public void recursive(TreeNode root,List<List<Integer>> result,int level) {
        if(root ==null){
            return;
        }
        if(level>=result.size()){
            result.add(0,new ArrayList<Integer>());
        }
        recursive(root.left,result,level+1);
        recursive(root.right,result,level+1);
        result.get(result.size()-level-1).add(root.val);
    } 
}
