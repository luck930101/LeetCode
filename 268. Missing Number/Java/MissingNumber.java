
public class MissingNumber {
	public int missingNumber(int[] nums) {
        
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }

        return (nums.length+1)*nums.length/2-sum;
    }
}
