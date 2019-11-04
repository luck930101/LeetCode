
public class RotateArray {
	public void rotate(int[] nums, int k) {
		int temp;
        for(int i = 0;i < k;i++){
        	for(int j = 0;j< nums.length-1;j++){
        		temp = nums[j+1];
        		nums[j+1] = nums[j];
        		nums[j] = temp;
        	}
        }
	}
	
	public void rotate2(int[] nums, int k) {
		int temp;
		
        for(int i = 0;i < nums.length;i++){
        	if(i<=k){

        	temp = nums[i];
        	nums[i] = nums[(i+k)%nums.length];
        	nums[(i+k)%nums.length] =temp;
        }
        	else{
            	temp = nums[i];
            	nums[i] = nums[(i+k)%nums.length+k];
            	nums[(i+k)%nums.length+k] =temp;
        	}
        }

	}
	
	public void rotate3(int[] nums, int k) {
		int temp;
		
        for(int i = 0;i < nums.length;i++){
        	if(i<=k){

        	temp = nums[i];
        	nums[i] = nums[(i+k)%nums.length];
        	nums[(i+k)%nums.length] =temp;
        }
        	else{
            	temp = nums[i];
            	nums[i] = nums[(i+k)%nums.length+k];
            	nums[(i+k)%nums.length+k] =temp;
        	}
        }

	}
}
