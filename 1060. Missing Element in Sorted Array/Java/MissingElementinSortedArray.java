
public class MissingElementinSortedArray {
	public int missingElement(int[] nums, int k) {
        int result = nums[0];
        int index = 1;
        while(k>0){
            if(index<nums.length){
                if(result+1==nums[index]){
                    result++;
                    index++;
                    
                }
                else{
                    k--;
                    result++;
                }
            }
            else{
                result++;
                k--;
            }
        }
        return result;
    }
}
