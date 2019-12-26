import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	Arrays.sort(nums);
    	for (int i = 0; i < nums.length; i++) {
			int target = -nums[i];
			int index1 = i+1;
			int index2 = nums.length-1;
			while(index1<index2){
				if(nums[index1]+nums[index2]>target){
					index2--;
				}
				else if(nums[index1]+nums[index2]<target){
					index1++;
				}
				else{
					if(!result.contains(Arrays.asList(nums[i],nums[index1],nums[index2]))){
						result.add(Arrays.asList(nums[i],nums[index1],nums[index2]));
					}
					index1++;
					index2--;
				}
			}
		}
        return result;
    }
}
