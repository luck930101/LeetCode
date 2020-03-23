import java.util.ArrayList;
import java.util.List;

public class MaximumWidthofBinaryTree {
	public int widthOfBinaryTree(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
         
        return caculateWidth(root,1,0,list);
        
    }
    
    public int caculateWidth(TreeNode root,int id,int depth,List<Integer> list) {
        if(root == null){return 0;}
        if(list.size()<=depth){list.add(id);}
        int nextlevel= Math.max(caculateWidth(root.left,id*2,depth+1,list),caculateWidth(root.right,id*2+1,depth+1,list));
        return Math.max(id - list.get(depth)+1,nextlevel);
    }
}
