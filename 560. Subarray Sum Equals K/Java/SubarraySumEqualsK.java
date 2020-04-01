import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public int subarraySumOn2(int[] nums, int k) {
    	//O(n^2)
    	int count = 0;
    	for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum+=nums[j];
				if(sum == k ){
					count++;
				}
			}
		}

    	return count;
    }
    
    public int subarraySumOn(int[] nums, int k) {
    	//O(n) 
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum = 0;
        int count = 0;
        map.put(0,1);
        for(int n:nums){
            sum+=n;
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        
        return count;
    }

}
