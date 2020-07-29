import java.util.ArrayList;
import java.util.List;
public class PathSumII {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        traverse(root,sum,result,new ArrayList<Integer>());
        
        return result;
        
    }
    
    public void traverse(TreeNode root, int sum, List<List<Integer>> result,List<Integer> current) {
        
        if(root ==null){
            return;
        }
        
        current.add(root.val);
        if(root.left == null&&root.right==null&&sum ==root.val){
            result.add(new ArrayList<Integer>(current));
            current.remove(current.size()-1);
            return;
        }
    
        traverse(root.left,sum-root.val,result,current);
        traverse(root.right,sum-root.val,result,current);
        current.remove(current.size()-1);
    }
}
