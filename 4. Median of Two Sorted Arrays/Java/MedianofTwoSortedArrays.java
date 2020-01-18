
public class MedianofTwoSortedArrays {
	public double findMedianSortedArraysA(int[] nums1, int[] nums2) {
        //O(m+n)
		int[] array = new int[nums1.length+nums2.length];
		int index1 = 0;
		int index2 = 0;
		int mainindex = 0;
		while(index1<nums1.length||index2<nums2.length){
			if(index1 == nums1.length){
				array[mainindex] = nums2[index2];
				index2++;
				
			}
			else if(index2 == nums2.length){
				array[mainindex] = nums1[index1];
				index1++;
			}
			else{
				if(nums1[index1]<nums2[index2]){
					array[mainindex] = nums1[index1];
					index1++;
				}
				else{
					array[mainindex] = nums2[index2];
					index2++;
				}
			}
			mainindex++;
		}
		
		if((nums1.length+nums2.length)%2==0){
			return (double)(array[(nums1.length+nums2.length-2)/2]+array[(nums1.length+nums2.length)/2])*0.5;
		}
		else{
			return (double)array[(nums1.length+nums2.length)/2];
		}
    }
	
	public double findMedianSortedArraysB(int[] nums1, int[] nums2) {
        //O(log(m+n))
		int target1 =  (nums1.length+nums2.length+1)/2;
		int target2 =  (nums1.length+nums2.length+2)/2;
		
		
		return (getNth(nums1,0,nums2,0,target1)+getNth(nums1,0,nums2,0,target2))/2.0;
    }
	
	public int getNth(int[] nums1, int index1 ,int[] nums2,int index2 ,int target) {
        //get the Nth number
		if(index1 > nums1.length-1){
			return nums2[index2+target-1];
		} 
		if(index2 > nums2.length-1){
			return nums1[index1+target-1];
		} 
		
		if(target ==1){
			return Math.min(nums1[index1], nums2[index2]);
		} 

		int value1 = Integer.MAX_VALUE;
		int value2 = Integer.MAX_VALUE;
		if(target/2 -1<nums1.length-index1){
			value1 = nums1[index1+target/2-1];
		}
		if(target/2-1<nums2.length-index2){
			value2 = nums2[index2+target/2-1];
		}

		if(value1<value2){
			return getNth(nums1,index1+target/2,nums2,index2,target-target/2);
		}
		else{
			return getNth(nums1,index1,nums2,index2+target/2,target-target/2);
		}
    }
}
