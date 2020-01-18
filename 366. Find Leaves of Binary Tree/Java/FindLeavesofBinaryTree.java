import java.util.ArrayList;
import java.util.List;

public class FindLeavesofBinaryTree {
    public List<List<Integer>> findLeaves(TreeNode root) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	findLeavesExecute(root,result);
    	return result;
    }
    
    public int findLeavesExecute(TreeNode root,List<List<Integer>> result) {
    	int level = -1;
    	if(root==null){
    		return level;
    	}
    	else{
    		level = Math.max(findLeavesExecute(root.left,result),findLeavesExecute(root.right,result))+1;
    		if(level>=result.size()){
    			ArrayList<Integer> newarray = new ArrayList<Integer>();
    			newarray.add(root.val);
    			result.add(newarray);
    		}
    		else{
    			result.get(level).add(root.val);
    		}
    	}
    	return level;

    }
}
