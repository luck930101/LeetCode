import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {
	public int findUnsortedSubarray(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int[] temp = nums.clone();
        Arrays.sort(temp);
        while(start<nums.length){
            if(nums[start] ==temp[start]){
                start++;
            }
            else{
                break;
            }
        }
        
        while(end>=0){
            if(nums[end] ==temp[end]){
                end--;
            }
            else{
                break;
            }
        }
        return start>=end?0:end-start+1;
    }
}
