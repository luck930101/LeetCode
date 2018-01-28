import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	Arrays.sort(candidates);
        recu(result,new ArrayList<>(),candidates,target,0);

        
        return result;
    }
    
    public void recu(List<List<Integer>> result, List<Integer> prep, 
    		int[] candidates, int remain,int start) {


        if (remain>0){
                for(int i = start;i<candidates.length;i++){
                prep.add(candidates[i]);
                recu(result,prep,candidates,remain-candidates[i],i);
                prep.remove(prep.size()-1);
                    }
        }
        else if(remain<0){
            return;
        }
        else{
            result.add(new ArrayList<>(prep));
        }
    		
    		
    	
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
