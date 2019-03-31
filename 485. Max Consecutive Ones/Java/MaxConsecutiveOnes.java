
public class MaxConsecutiveOnes {
	
	public int findMaxConsecutiveOnes(int[] nums) {
		int max = 0;
		int currentmax = 0;
		for(int i = 0;i< nums.length;i++){
			if(nums[i]==1){
				currentmax++;
			}
			else
			{
				max = Math.max(max, currentmax);
				currentmax =0;
			}
		}
		
		return max;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
