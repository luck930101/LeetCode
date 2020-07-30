import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        
        if(root == null){
            return result; 
        }
        traverse(root,result,"");
        return result; 
    }
    
    public void traverse(TreeNode root, List<String> result, String current) {
        if(root ==null){
            return;
        }
        current = current+String.valueOf(root.val);
        if(root.left==null&&root.right==null){
            result.add(current);
        }
        if(root.left!=null){
            traverse(root.left,result,current+"->");

        }
        if(root.right!=null){
            traverse(root.right,result,current+"->");

        }    
        
    }

}
