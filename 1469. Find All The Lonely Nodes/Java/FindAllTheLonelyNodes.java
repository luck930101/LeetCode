import java.util.ArrayList;
import java.util.List;
public class FindAllTheLonelyNodes {
	public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        traverse(list,root);
        
        return list;
    }
    
    public void traverse(List<Integer> list, TreeNode root) {
        if(root == null){return;}
        if(root.left !=null && root.right ==null){
            list.add(root.left.val);
        }
        if(root.left ==null && root.right != null){
            list.add(root.right.val);
        }
        traverse(list,root.left);
        traverse(list,root.right);
    }
}
