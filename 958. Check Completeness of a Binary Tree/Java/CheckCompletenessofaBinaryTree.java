import java.util.LinkedList;
import java.util.Queue;

public class CheckCompletenessofaBinaryTree {
	public boolean isCompleteTree(TreeNode root) {
        boolean end = false;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            
            if(current ==null){
                end = true;
            }
            else{
                if(end){return false;}
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        
        return true;
    }
}
