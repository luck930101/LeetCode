
public class HouseRobber {
	public int rob(int[] nums) {
    	if(nums.length==0)return 0;
    	if(nums.length==1)return nums[0];
    	int[] dp = new int[nums.length+1];
    	dp[0] = 0;
    	dp[1] = nums[0];
    	dp[2] = nums[1];
        int money = Math.max(dp[1],dp[2]);
    	for (int i = 3; i < nums.length+1; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3])+nums[i-1];
			money = Math.max(money,dp[i]);
		}
        return money;
    }
}
