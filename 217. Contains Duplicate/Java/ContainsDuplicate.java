import java.util.HashSet;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for(int n : nums){
        	if(set.contains(n)){return true;}
        	set.add(n);
        }
        return false;
    }
}
