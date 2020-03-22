
public class SearchinRotatedSortedArray {
	public int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		int mid = (start + end)/2;
		
		while(end>=start){
			if(target == nums[mid]){
				return mid;
			}
			else if(nums[start]<=nums[mid]){
				//First half is unrotated
				//Don't forget equal case here
				if(target<nums[mid]&&target>=nums[start]){
					end = mid-1;
				}
				else{
					start = mid+1;
				}
			}
			else{
				//First half is rotated
				//Don't forget equal case here
				if(target<=nums[end]&&target>nums[mid]){
					start = mid+1;
				}
				else{
					end = mid-1;
				}
			}
			mid = (start + end)/2;
		}
        return -1;
    }
}
