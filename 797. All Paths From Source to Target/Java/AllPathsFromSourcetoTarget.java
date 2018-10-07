import java.util.LinkedList;
import java.util.List;
public class AllPathsFromSourcetoTarget {
	
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
    	List<List<Integer>> result = new LinkedList<List<Integer>>();
    	List<Integer> currentlist = new LinkedList<Integer>();
    	currentlist.add(0);
    	DepthFirstSearch(graph,0,currentlist,result);
    	
    	return result;
    	
    }
    
    public void DepthFirstSearch(int[][] graph,int index, List<Integer> currentlist, List<List<Integer>> result){
    	currentlist.add(index);
    	if(index == graph.length-1){
    		result.add(new LinkedList<Integer>(currentlist));
    	}
    	else{
    		for(int i = 0;i<graph[index].length;i++){
    			
    			DepthFirstSearch(graph,graph[index][i],currentlist,result);
    		}
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
