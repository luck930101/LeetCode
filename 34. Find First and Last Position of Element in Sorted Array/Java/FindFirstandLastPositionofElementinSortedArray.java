
public class FindFirstandLastPositionofElementinSortedArray {
	public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findLeft(nums,target);
        result[1] = findRight(nums,target);
        
        return result;
        
    }
    
    public int findLeft(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length -1;
        int mid = (left+right)/2;
        while(left<=right){
            if(nums[mid]>=target){
                right = mid-1;
                
            }
            else{
                left = mid+1;
            }
            if(nums[mid]==target){index = mid;}
            mid = (left+right)/2;
        }
        
        return index;
    }
    
        public int findRight(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length -1;
        int mid = (left+right)/2;
        while(left<=right){
            if(nums[mid]<=target){
                left = mid+1;
                
            }
            else{
                right = mid-1;
            }
            if(nums[mid]==target){index = mid;}
            mid = (left+right)/2;
        }
        
        return index;
    }
    
}
