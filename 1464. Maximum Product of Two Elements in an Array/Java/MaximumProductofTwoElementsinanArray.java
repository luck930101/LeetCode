
public class MaximumProductofTwoElementsinanArray {
	public int maxProduct(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = 1;i< nums.length;i++){
            for(int j = i-1;j>=0;j--){
                dp[i] = Math.max(dp[i],(nums[i]-1)*(nums[j]-1));
            }
        }
        int max = 0;
        for(int i = 1;i< nums.length;i++){
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
