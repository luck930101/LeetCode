import java.util.HashMap;
import java.util.Map;

public class SubarraySumsDivisiblebyK {
	public int subarraysDivByK(int[] A, int K) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum = 0;
        int count = 0;
        map.put(0,1);
        for(int n: A){
            sum +=n;
            sum%=K;
            if(sum<0){
                sum += K;
            }
            count+=map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        
        return count;
    }
	
	public int subarraysDivByKNaive(int[] A, int K) {
        int count = 0;
        for(int i = 0;i<A.length;i++){
            int sum =0;
            for(int j = i;j<A.length;j++){
                sum+=A[j];
                if(sum%K==0){
                    count++;
                }
            }
        }
        return count;
    }
}
