import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        recursive(root,result,0);
        return result;
    }
    
    public void recursive(TreeNode root,List<List<Integer>> result,int level){
        if(root ==null){return;}
        if(level>=result.size()){
            result.add(new ArrayList<Integer>());
        }
        
        if(level%2==0){
            result.get(level).add(root.val);
        }
        else{
            result.get(level).add(0,root.val);
        }
        
        recursive(root.left,result,level+1);
        recursive(root.right,result,level+1);
        
    }
}
