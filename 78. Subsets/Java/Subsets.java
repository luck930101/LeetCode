import java.util.ArrayList;
import java.util.List;

public class Subsets {
	public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        addToResult(nums,result,new ArrayList<Integer>(),0);
        
        return result;
        
    }
    
    public void addToResult(int[] nums, List<List<Integer>> result, List<Integer> current, int index ) {
        result.add(new ArrayList<Integer>(current));
        if(index>=nums.length){
            return;
        }
        
        for(int i = index; i <nums.length;i++ ){
            current.add(nums[i]);
            addToResult(nums,result,current,i+1);
            current.remove(current.size()-1);

        }

    }
}
