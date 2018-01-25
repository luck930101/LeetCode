import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    	int[] result ={0,0};
        for(int i = 0; i < nums.length;i++)
        {
            for(int j = i+1; j < nums.length;j++){
                if (nums[i]+nums[j]==target){
                    // int[] result={nums[i],nums[j]};
                     result[0]=nums[i];
                     result[1]=nums[j];
                     
                }
            }
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSum s = new TwoSum();
		int[] nums= {3,2,4};
		int target = 6;
		
		System.out.println(Arrays.toString(s.twoSum(nums, target)));

	}

}
