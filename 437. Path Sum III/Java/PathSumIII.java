import java.util.HashMap;
import java.util.Map;

public class PathSumIII {
	int count = 0;
    public int pathSum(TreeNode root, int sum) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1);
        recursive(root,sum,0,map);
        return count;
    }
    
    public void recursive(TreeNode root, int sum, int currentsum,Map<Integer,Integer> map){
        if(root == null){
            return;
        }
        currentsum = currentsum+root.val;
        if(map.containsKey(currentsum-sum)){
            count+= map.get(currentsum-sum);
        }

        
        map.put(currentsum,map.getOrDefault(currentsum,0)+1);
        
        recursive(root.left,sum,currentsum,map);
        recursive(root.right,sum,currentsum,map);
        map.put(currentsum,map.get(currentsum)-1);
            
    }
}
