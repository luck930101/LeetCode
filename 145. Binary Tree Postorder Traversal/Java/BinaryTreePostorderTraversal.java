import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        
        if(root == null){
        	return result;
        }
        stack.push(root);
        while(!stack.isEmpty()){
        	TreeNode currentnode = stack.pop();
        	result.addFirst(currentnode.val);
        	
        	if(currentnode.left!=null){
        		stack.push(currentnode.left);
        	}
        	if(currentnode.right!=null){
        		stack.push(currentnode.right);
        	}
        }
        
        return result;
    }

}
