
public class SingleElementinaSortedArray {
	public int singleNonDuplicate(int[] nums) {
		//O(n) solution
	    int result = 0;
	    for(int i :nums){
	        result^=i;    
	    }
	    return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
