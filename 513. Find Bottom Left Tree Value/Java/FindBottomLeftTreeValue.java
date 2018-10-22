import java.util.ArrayList;

public class FindBottomLeftTreeValue {
	
    public int findBottomLeftValue(TreeNode root) {
    	ArrayList<Integer> array = new ArrayList<Integer>();
    	findBottomLeftValuehelper(root,0,array);
        return array.get(array.size()-1);
    }
    public void findBottomLeftValuehelper(TreeNode root,int depth, ArrayList<Integer> array) {
    	if(root == null){
    		return;
    	}
    	if(array.size()<depth+1){
    		array.add(root.val);
    	}
    	findBottomLeftValuehelper(root.left,depth +1,array);
    	findBottomLeftValuehelper(root.right,depth +1,array);

    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
