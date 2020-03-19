
public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int level = 2; level <= n;level++){
            for(int root = 1 ; root <=level;root ++){
                dp[level] += dp[root-1]*dp[level- root];
            }
        }
        
        return dp[n];
    }
}
