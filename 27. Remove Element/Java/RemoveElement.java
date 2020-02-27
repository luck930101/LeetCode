
public class RemoveElement {
	public int removeElementA(int[] nums, int val) {
		int low = 0;
		int high = 0;
        while(high<nums.length){
        	if(nums[low] == val&&nums[high] != val){
        		int temp =nums[high];
        		nums[high] = nums[low];
        		nums[low] = temp;
        	}
        	if(nums[low] != val){low++;}
        	if(nums[high] == val||high<low){high++;}
        }
        return low;
    }
	
	public int removeElementB(int[] nums, int val) {
		int low = 0;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i] != val){
				nums[low] = nums[i];
				low++;
			}
		}
        return low;
    }

}
