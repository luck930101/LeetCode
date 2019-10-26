
public class ProductofArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int mult = 1;
		for(int i = 0 ; i<nums.length;i++){
			result[i] = mult;
			mult *= nums[i];
		}
		mult = 1;
		for(int i = nums.length-1 ; i>=0;i--){
			result[i] *= mult;
			mult *= nums[i];
		}
		
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
