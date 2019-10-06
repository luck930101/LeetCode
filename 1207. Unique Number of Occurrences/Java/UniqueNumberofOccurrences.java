import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {
	public boolean uniqueOccurrences(int[] arr) {
		
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for(int i : arr){
			hashmap.put(i, hashmap.get(i)==null?0:hashmap.get(i)+1);
		}
		
		HashSet<Integer> hashmap_value = new HashSet<Integer>(hashmap.values());
		
        return hashmap_value.size() == hashmap.values().size();
    }
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		hashmap.put(1, 2);
		hashmap.put(2, 3);
		hashmap.put(3, 4);
		
		for (int value: hashmap.values()) {
		    System.out.println("key : " + value);
		}
		
		System.out.println(hashmap.values().size());

	}
}
