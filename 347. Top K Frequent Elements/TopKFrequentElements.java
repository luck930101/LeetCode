import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        List<Integer>[] bucket = new List[nums.length+1];
        
        for(int key:map.keySet()){
            if(bucket[map.get(key)] == null){
                bucket[map.get(key)] = new ArrayList<Integer>();
            }
            bucket[map.get(key)].add(key);
        }
        
        for(int i = bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(int j = 0;j <bucket[i].size();j++){
                    result[result.length-k] = bucket[i].get(j);
                    k--;
                    if(k==0){
                        return result;
                    }
                }
            }
        }
        return result;
        
    }
}
