import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionofTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		
		for(int i :nums1){
			hashmap.put(i, 1);
		}
		
		for(int i :nums2){
			if(hashmap.get(i)==null){continue;}
			if(hashmap.get(i)==1&&!arraylist.contains(i)){
				arraylist.add(i);
			}
		}
		int[] result = new int[arraylist.size()];
		for(int i = 0; i< arraylist.size();i++){
			result[i] = arraylist.get(i); 
		}
		return result;
        
    }

}
