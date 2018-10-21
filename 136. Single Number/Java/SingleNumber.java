import java.util.Arrays;

public class SingleNumber {
	public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1;i<nums.length;i+=2){
        	if(nums[i-1]!=nums[i]){
        		return nums[i-1];
        	}
        }
        return nums[nums.length-1];
    }

//	public int singleNumber(int[] nums) {
//	    int result = 0;
//	    for(int i : nums) {
//	        result ^= i;
//	    }
//	    return result;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
