
public class PaintHouse {
	public int minCost(int[][] costs) {
        int[][] dp = new int[costs.length+1][3];
        dp[0][0] = 0;
        dp[0][1] = 0;
        dp[0][2] = 0;
        for(int i = 1; i <= costs.length;i++ ){
            dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2]) + costs[i-1][0];
            dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2]) + costs[i-1][1];
            dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1]) + costs[i-1][2];
        }
        
        return Math.min(Math.min(dp[dp.length-1][0],dp[dp.length-1][1]),dp[dp.length-1][2]);
    }
}
