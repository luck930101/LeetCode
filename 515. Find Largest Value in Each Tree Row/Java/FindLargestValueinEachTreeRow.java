import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class FindLargestValueinEachTreeRow {
	public List<Integer> largestValues(TreeNode root) {
//		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();  
		ArrayList<Integer> result  = new ArrayList<Integer>();
		updateArray(root,0,result);
        return result;
    }
	public void updateArray(TreeNode root,int depth,ArrayList<Integer> array) {
		if(root ==null){
			return;
		}
		if(array.size()<depth+1){
			array.add(root.val);
		}
		if(array.get(depth)<root.val){
			array.set(depth, root.val);
		}
		
		updateArray(root.left,depth+1,array);
		updateArray(root.right,depth+1,array);
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
