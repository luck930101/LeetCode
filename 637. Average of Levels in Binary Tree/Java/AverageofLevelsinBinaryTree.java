import java.util.ArrayList;
import java.util.List;

public class AverageofLevelsinBinaryTree {
	
	public List<Double> averageOfLevels(TreeNode root) {
		
        List<Double> resultlist = new ArrayList<Double>();
        List<Integer> countlist = new ArrayList<Integer>();
        countAverage(root,0,resultlist,countlist);
        
        for(int i = 0; i <resultlist.size();i++){
        	resultlist.set(i, resultlist.get(i)/countlist.get(i));
        }
        
        return resultlist;
    }
	
	public void countAverage(TreeNode root, int depth, List<Double> resultlist, List<Integer> countlist){
		if(root!=null){
			if(depth >resultlist.size()-1){
				countlist.add(0);
				resultlist.add(0.0);
			}
			countlist.set(depth, countlist.get(depth)+1);
			resultlist.set(depth, resultlist.get(depth)+root.val);
			countAverage(root.left,depth+1,resultlist,countlist);
			countAverage(root.right,depth+1,resultlist,countlist);
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
