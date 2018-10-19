import java.util.ArrayList;
import java.util.List;
public class FindAllDuplicatesinanArray {
	public List<Integer> findDuplicates(int[] nums) {
		//or set nums[num[i]] to be negative
        List<Integer> result = new ArrayList<Integer>();
        int[] newarray = new int[nums.length]; 
        for(int i = 0; i<nums.length;i++){
        	if(newarray[nums[i]]==0){
        		newarray[nums[i]-1]= nums[i];
        	}
        	else{
        		result.add(nums[i]);
        	}
        }
        
        return result;
    }

	public static void main(String[] args) {
		FindAllDuplicatesinanArray fada = new FindAllDuplicatesinanArray();
		int [] array ={1,2,3};
		fada.findDuplicates(array);
		// TODO Auto-generated method stub

	}

}
