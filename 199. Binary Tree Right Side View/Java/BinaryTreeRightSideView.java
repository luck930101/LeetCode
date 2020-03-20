import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        addToList(root,result,0);
        return result;
    }
    
    public void addToList(TreeNode root,List<Integer> list, int depth) {
        if(root ==null){
            return;
        }
        if(depth == list.size()){
            list.add(root.val);
        }
        addToList(root.right,list,depth+1);
        addToList(root.left,list,depth+1);
    }
}
