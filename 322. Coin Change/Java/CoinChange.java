
public class CoinChange {
	public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i=1;i<dp.length;i++){
        	dp[i] = Integer.MAX_VALUE-1;
        }
        for(int i=0;i<dp.length;i++){
        	for(int coin:coins){
        		dp[i] = Math.min(dp[(i-coin<0)?amount:i-coin]+1, dp[i]);
        	}
        }
        return (dp[amount]==Integer.MAX_VALUE-1)?-1:dp[amount];
    }
	
	public int resursivecoinChange(int[] coins, int amount) {
		int min = Integer.MAX_VALUE-1;
		if(amount == 0){
			return 0;
		}
		else if(amount<0){
			return -1;
		}
		else{
			for(int coin : coins){
				int current = resursivecoinChange(coins,amount-coin);
				min = Math.min(min, (current<0)?Integer.MAX_VALUE-1:current+1);
			}
			return (min==Integer.MAX_VALUE-1)?-1:min;
		}
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
