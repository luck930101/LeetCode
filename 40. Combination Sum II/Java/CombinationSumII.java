import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CombinationSumII {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        combinationSum2Execute(candidates,target,0, result,new ArrayList<Integer>());
    	return result; 
    }
	
	public void combinationSum2Execute(int[] candidates, int target, int index, List<List<Integer>> result, List<Integer> currentlist ) {
		if(target == 0){
			result.add(new ArrayList<Integer>(currentlist));
            return;
		}
		else if (target < 0){
			return;
		}
		else {
			int loopindex = index;
			while(target>0 &&loopindex<candidates.length){
                if(loopindex>index&&candidates[loopindex] == candidates[loopindex-1]){loopindex++;continue;}
				currentlist.add(candidates[loopindex]);
				combinationSum2Execute(candidates,target - candidates[loopindex],loopindex+1,result, currentlist);
				loopindex++;
				currentlist.remove(currentlist.size()-1);
			}
		}
        
    }

}
