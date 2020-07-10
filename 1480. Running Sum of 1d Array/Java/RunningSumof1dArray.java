
public class RunningSumof1dArray {
	public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int current = 0;
        for(int i = 0; i<nums.length;i++){
            result[i] = nums[i]+current;
            current+=nums[i];
        }
        
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
