
public class CheckIfaNumberIsMajorityElementinaSortedArray {
	
	public boolean isMajorityElementA(int[] nums, int target) {
		//O(N)
		int count = 0;
        for(int number: nums){
        	if(number==target)
        		count++;			
        }
        return count>(nums.length/2);  
    }
	
	public boolean isMajorityElementB(int[] nums, int target) {
		
		int firsttargetindex = findTarget(nums,target);
		int lasttargetindex = findTarget(nums,target+1);
        return ((lasttargetindex-firsttargetindex)>(nums.length/2));  
    }
	
	public int findTarget(int[] nums, int target) {
		int low = 0;
		int high = nums.length;
		
		while(low<high){
			int mid = low + (high -low)/2;
			if(nums[mid]<target){low = mid+1;}
			else{high = mid;}
		}
        return low;  
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
