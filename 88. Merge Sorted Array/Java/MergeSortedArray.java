
public class MergeSortedArray {
	public static void  merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1ptr = m-1;
        int nums2ptr = n-1;
        int totalptr = m+n-1;
        
        while(nums1ptr>=0 && nums2ptr>=0){
        	if(nums1[nums1ptr]>nums2[nums2ptr]){
        		nums1[totalptr] = nums1[nums1ptr];
        		nums1ptr--;
        		totalptr--;
        	}
        	else{
        		nums1[totalptr] = nums2[nums2ptr];
        		nums2ptr--;
        		totalptr--;
        	}
        }
        while(nums2ptr>=0){
        	nums1[totalptr] = nums2[nums2ptr];
    		nums2ptr--;
    		totalptr--;
        }
    }

	public static void main(String[] args) {
		int[] a = {1,2,3,0,0,0};
		int[] b = {2,5,6};
		merge(a,3,b,3);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
			
	}

}

