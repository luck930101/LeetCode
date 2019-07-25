
public class ArrayNesting {
	
	public int arrayNesting(int[] nums) {
		int maxcount = 0;
		
		for(int i = 0; i< nums.length;i++){
	        int current = i;
	        int count = 0;
	        
	        while (nums[current] !=-1){
	            int newcurrent = nums[current];
	        	nums[current] =-1;
	        	current = newcurrent;
	        	count++;
	        }
	        maxcount = Math.max(maxcount, count);
		}

        return maxcount;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
