
public class MaximumSubarray {
	
	public int maxSubArrayDP(int[] nums) {
		int max = nums[0];
		for(int i = 1; i < nums.length;i++){
			nums[i] = nums[i-1]>=0?(nums[i-1]+nums[i]):nums[i];
			max = Math.max(max, nums[i]);
		}
        return max;
    }
	
	public int maxSubArrayGreedy(int[] nums) {
		int max = Integer.MIN_VALUE;
		int submax = Integer.MIN_VALUE;
		
		for (int n :nums){
			if(submax<0){
				submax = n;
			}
			else{
				submax += n;
			}
			max = Math.max(max, submax);
		}
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
