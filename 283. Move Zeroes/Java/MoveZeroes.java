
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		for(int i = nums.length-1;i >=0 ;i--){
			int j = i;
			if(nums[i]==0){
				while(j!=nums.length-1){
					if(nums[j+1]==0){
						break;
					}
					nums[j] = nums[j+1];
					nums[j+1] = 0;
					j++;	
				}
			}
	        
		}
	}
	public void moveZeroesv2(int[] nums) {
		
		int index = 0;
		for(int num :nums){
			if (num!=0){
				nums[index]=num;
				index++;
			}
		}
		
		while(index<nums.length){
			nums[index] = 0;
			index++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
