
public class SortColors {
	public void sortColors(int[] nums) {
		int index_1 = 0;
        int index_2 = nums.length-1;
        int index = 0;
        int temp;
        while (index<=index_2){
        	if(nums[index]==0){
        		nums[index]= nums[index_1];
        		nums[index_1] = 0;
                index_1++;
        		index++;
        		
        	}
        	else if(nums[index]==2){
        		temp = nums[index];
        		nums[index] = nums[index_2];
        		nums[index_2] = temp;
        		index_2--;
        	}
        	else{
        		index++;
        	}
        	
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
