import java.util.Arrays;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
        return nums[nums.length/2];
    }
	
	public int majorityElement2(int[] nums) {
		int majority = nums[0];
		int count = 0;
		
		for(int i =1; i< nums.length;i++){
			if(count ==0){
				majority =nums[i];
				count++;
			}
			else if( nums[i] == majority){
				count++;
			}
			else{
				count--;
				
			}
	    }
		return majority;
	}
	
}
