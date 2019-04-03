import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result  = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++){
        	nums[Math.abs(nums[i])-1]=-Math.abs(nums[Math.abs(nums[i])-1]);
        	
        }
        for(int i = 0;i<nums.length;i++){
        	if(nums[i]>=0){
               result.add(i+1); 
        	}
        }
        
        return result; 
        }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
