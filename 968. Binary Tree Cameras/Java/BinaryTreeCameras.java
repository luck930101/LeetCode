
public class BinaryTreeCameras {
	public int NOTMONITORED =0;
    public int MONITORED_WITHCAM = 1;
    public int MONITORED_NOCAM = 2;
    public int cameras =0;
    
    public int minCameraCover(TreeNode root) {
        if(root==null){return 0;}
        int rootcam = addCamera(root);
        return cameras+(rootcam==NOTMONITORED?1:0);
    }
    
    public int addCamera(TreeNode root) {
        if(root ==null){return MONITORED_NOCAM;}
        
        int left = addCamera(root.left);
        int right = addCamera(root.right);
        
        if(left ==NOTMONITORED||right ==NOTMONITORED){
            cameras++;
            return MONITORED_WITHCAM;
        }
        
        if(left ==MONITORED_NOCAM&&right ==MONITORED_NOCAM){
            return NOTMONITORED;
        }
        return MONITORED_NOCAM;
    }
}
