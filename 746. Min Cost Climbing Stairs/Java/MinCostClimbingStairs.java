
public class MinCostClimbingStairs {
	public int minCostClimbingStairs(int[] cost) {
        int[] db = new int[cost.length+1];
        
        db[0] = 0;
        db[1] = cost[0];
        
        for(int i = 2;i<db.length;i++){
            db[i]=Math.min(db[i-1],db[i-2])+cost[i-1];
        }
        return Math.min(db[db.length-1],db[db.length-2]);
        
    }
}
