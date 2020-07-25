import java.util.ArrayList;
import java.util.List;
public class KthSmallestElementinaBST {
	public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<Integer>();
        kthSmallest(root,list);
        return list.get(k-1);
        
    }
    
    public void kthSmallest(TreeNode root, List list) {
        if(root!=null){
            kthSmallest(root.left,list);
            list.add(root.val);
            kthSmallest(root.right,list);
        }
    }
}
