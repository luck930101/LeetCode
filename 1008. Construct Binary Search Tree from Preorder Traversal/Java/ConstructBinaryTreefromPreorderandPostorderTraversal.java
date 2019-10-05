
public class ConstructBinaryTreefromPreorderandPostorderTraversal {
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
    	TreeNode root = constructFromPrePostSection(pre,0,pre.length-1,post,0,post.length-1);
        return root;
    }
    
    public TreeNode constructFromPrePostSection(int[] pre, int prestart, int preend, int[] post, int poststart, int postend) {
    	if (prestart>preend){
    		return null;
    	}
    	TreeNode node = new TreeNode(pre[prestart]);
    	int postindex = -1;
    	for(int i = poststart; i < postend;i++){
    		if (post[i] == pre[prestart+1]){
    			postindex = i;
    			break;
    		}
    	}
    	
    	if (postindex == -1){
    		return node;
    	}
    	node.left = constructFromPrePostSection(pre,prestart+1,prestart+1+postindex - poststart ,post,poststart,postindex);
    	node.right = constructFromPrePostSection(pre,preend - postend + postindex +2,preend,post,postindex+1,postend -1);
    	return node;
    }  
    
}
