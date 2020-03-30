import java.util.ArrayList;
import java.util.List;

public class MaximumLevelSumofaBinaryTree {
	public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int result = 0;
        List<Integer> sumlist = new ArrayList<Integer>();
        recurive(root,sumlist,0);
        for(int i = 0;i < sumlist.size();i++){

            if(sumlist.get(i)>max){
                max = sumlist.get(i);
                result = i;
            }
        }
        return result+1;
    }
    
    public void recurive(TreeNode root,List<Integer> sumlist,int level) {
        if(root ==null){return;}
        if(level >= sumlist.size()){
            sumlist.add(0);
        }
        sumlist.set(level,sumlist.get(level)+root.val);
        recurive(root.left,sumlist,level+1);
        recurive(root.right,sumlist,level+1);
    }
}
