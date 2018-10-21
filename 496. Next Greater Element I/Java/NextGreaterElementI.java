
public class NextGreaterElementI {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        loop: for(int i =0 ;i<nums1.length;i++){
        	for(int j = 0;j < nums2.length;j++){
        		if(nums1[i] == nums2[j]){
        			for(int k = j;k < nums2.length;k++){
        				if(nums2[k]>nums2[j]){
        					result[i] = nums2[k];
        					continue loop;
        				}
        			}
        			result[i] = -1;
    				continue loop;
        		}
        	}
        }
        return result;
    }

	public static void main(String[] args) {
		NextGreaterElementI ngeI= new NextGreaterElementI();
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		ngeI.nextGreaterElement(nums1, nums2);
		// TODO Auto-generated method stub

	}

}
