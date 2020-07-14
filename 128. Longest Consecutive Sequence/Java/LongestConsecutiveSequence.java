import java.util.HashMap;

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int n : nums){
            if(!map.containsKey(n)){
                
                int left = map.getOrDefault(n-1,0);
                int right = map.getOrDefault(n+1,0);
                int current  = left + right+1;
                map.put(n,current);
                max = Math.max(max,current);
                
                map.put(n-left,current);
                map.put(n+right,current);
                
            }

        }
        
        return max;
    }
}
