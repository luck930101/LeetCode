
public class FindaCorrespondingNodeofaBinaryTreeinaCloneofThatTree {
	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original ==null||original==target){
            return cloned;
        }
        
        TreeNode result = getTargetCopy(original.left,cloned.left,target);
        if(result == null){
            return getTargetCopy(original.right,cloned.right,target);
        }
        
        return result;
    }
}
