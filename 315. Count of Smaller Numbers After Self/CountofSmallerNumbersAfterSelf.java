import java.util.List;
import java.util.ArrayList;

public class CountofSmallerNumbersAfterSelf {
	//naive solution
	public List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            result.add(count);
        }
        
        return result;
    }
}
