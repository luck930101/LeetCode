import java.util.ArrayList;
import java.util.List;
public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(result,root,0);
        return result;
    }
    
    public void helper(List<List<Integer>> result,Node current, int depth){
    	
    	if (current ==null){return;}
    	if (result.size()<=depth){
    		List<Integer> newlist = new ArrayList<Integer>();
    		newlist.add(current.val);
    		result.add(newlist);
    	}
    	else{
    		result.get(depth).add(current.val);
    	}
    	for(int i = 0;i< current.children.size();i++){
    		helper(result,current.children.get(i),depth+1);
    	}
    }
}
