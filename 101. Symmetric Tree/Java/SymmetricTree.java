import java.util.Stack;

public class SymmetricTree {
	//Recursively 
    public boolean isSymmetricRecursive(TreeNode root) {
        return isSame(root,root);
    }
    
    public boolean isSame(TreeNode left,TreeNode right) {
        if(left==null&&right==null){return true;}
        if(left==null||right==null){return false;}
        if(left.val!=right.val){return false;}
        else{
            
            return isSame(left.left,right.right)&&isSame(left.right,right.left);
        }
    }
    
	//Iteratively 
    public boolean isSymmetricIterative(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(root);
        s2.push(root);
        while(!s1.isEmpty()){
            TreeNode node1 = s1.pop();
            TreeNode node2 = s2.pop();
            if(node1==null && node2==null){continue;}
            if(node1==null || node2==null){return false;}
            if(node1.val != node2.val){return false;}
            else{
                s1.push(node1.left);
                s2.push(node2.right);
                s1.push(node1.right);
                s2.push(node2.left);
            }
        }
        
        return true;
    }
}
