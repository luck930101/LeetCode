
public class MaximumProductSubarray {
	public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int temp; 
        int result = nums[0];
        for(int i = 1 ;i<nums.length;i++){
            temp = max;
            max = Math.max(max*nums[i],min*nums[i]);
            max = Math.max(nums[i],max);
            
            min = Math.min(min*nums[i],temp*nums[i]);
            min = Math.min(nums[i],min);
            
            if(max >result){
                result = max;
            }
            
        }
        
        return result;
    }
}
