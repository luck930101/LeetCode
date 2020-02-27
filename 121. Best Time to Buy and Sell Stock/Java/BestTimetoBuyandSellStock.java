
public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
        int max = 0;
        int result = 0;
        for(int i = 1; i < prices.length;i++){
        	max = Math.max(0, max+= prices[i]-prices[i-1]);
        	result = Math.max(result, max);
        }
        return result;
    }
}
