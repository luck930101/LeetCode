import java.util.Arrays;

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
    	Arrays.sort(nums);
    	int sum =0;
    	for (int i = 0;i<(nums.length/2);i++){
    		sum+=nums[i];
    	}
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
