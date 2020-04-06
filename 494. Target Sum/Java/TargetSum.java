
public class TargetSum {
	public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for(int n: nums){
            sum+=n;
        }
        if(sum<S||-sum>S){
            return 0;
        }
        
        int[][] dp = new int[nums.length+1][sum*2+1];
        dp[0][sum] =1;
        for(int i = 1;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                if(j+nums[i-1]<sum*2+1){
                    dp[i][j]+=dp[i-1][j+nums[i-1]];
                }
                if(j-nums[i-1]>=0){
                    dp[i][j]+=dp[i-1][j-nums[i-1]];
                }
            }
        }
        
        return dp[dp.length-1][sum+S];
    }    
	/*
	 * Naive solution
	int count = 0;
    public int findTargetSumWays(int[] nums, int S) {
        recursive(nums,S,0,0);
        return count;
    }
    
    public void recursive(int[] nums, int S,int current, int index){
        if(index == nums.length){
            if(current == S){
                count++;
            }
            return;
        }
        
        recursive(nums,S,current+nums[index],index+1);
        recursive(nums,S,current-nums[index],index+1);
    }
    */
}
