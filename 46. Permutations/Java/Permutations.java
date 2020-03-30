import java.util.ArrayList;
import java.util.List;

public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        permute(nums,result,new ArrayList<Integer>(),0);
        
        return result;
    }
    
    public void permute(int[] nums,List<List<Integer>> result, List<Integer> current, int index) {
        if(index == nums.length){
            result.add(new ArrayList<Integer>(current));
        }
        for(int i = 0;i<nums.length;i++){
            if(current.contains(nums[i])){
                continue;
            }
            current.add(nums[i]);
            permute(nums,result,current,index+1);
            current.remove(current.size()-1);
        }
    }
}
