
public class SortanArray {
    public int[] sortArray(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int j = i-1;
			int current = nums[i];
			while(j >= 0&&current<nums[j]){
				nums[j+1] = nums[j];
				j--;
			}
			nums[j+1]=current;
		}
        return nums;
	}
}
