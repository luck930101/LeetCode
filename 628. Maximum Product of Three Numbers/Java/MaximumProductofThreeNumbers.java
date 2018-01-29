import java.util.Arrays;

public class MaximumProductofThreeNumbers {
	
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[nums.length-1],nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,21,-13,2,4,5,2,6,4,6,-99,-97};
		MaximumProductofThreeNumbers ma = new MaximumProductofThreeNumbers();
		System.out.println(ma.maximumProduct(nums));

	}

}
