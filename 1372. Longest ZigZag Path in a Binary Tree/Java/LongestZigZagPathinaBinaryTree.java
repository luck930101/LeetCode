
public class LongestZigZagPathinaBinaryTree {
	int max = 0;
    public int longestZigZag(TreeNode root) {
        start(root,true,0);
        start(root,false,0);
        return max;
    }
    
    public void start(TreeNode root,boolean left,int depth) {
        if(root ==null){return;}
        max = Math.max(max,depth);
        if(left){
            start(root.right,false,depth+1);
            start(root.left,true,1);
        }
        else{
            start(root.left,true,depth+1);
            start(root.right,false,1);
        }
        
    }
}
