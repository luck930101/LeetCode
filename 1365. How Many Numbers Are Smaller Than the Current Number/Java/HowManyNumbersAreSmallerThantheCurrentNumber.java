
public class HowManyNumbersAreSmallerThantheCurrentNumber {
	public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] result = new int[nums.length];
        for(int i = 0 ; i < nums.length;i++){
            count[nums[i]]++;
        }
        for(int i = 1; i<count.length;i++){
            count[i] = count[i]+count[i-1];
        }
        for(int i = 0 ; i < nums.length;i++){
            result[i]=(nums[i]-1)<0?0:count[nums[i]-1];
        }
    return result;
    }
}
