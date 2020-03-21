
public class CousinsinBinaryTree {
	int xparent = 0;
    int yparent = 0;
    int xdepth = -1;
    int ydepth =-2;
    public boolean isCousins(TreeNode root, int x, int y) {
        findNodes(root,x,y,0,0);
        if(xparent!=yparent&&xdepth==ydepth){
            return true;
        } 
        return false;
    }
    
    public void findNodes(TreeNode root, int x, int y, int depth, int parent) {
        if(root ==null){return;}
        
        if(root.val == x){
            xparent = parent;
            xdepth = depth;
        }
        
        if(root.val == y){
            yparent = parent;
            ydepth = depth;
        }
        findNodes(root.left,x,y,depth+1,root.val);
        findNodes(root.right,x,y,depth+1,root.val);
    } 
}
