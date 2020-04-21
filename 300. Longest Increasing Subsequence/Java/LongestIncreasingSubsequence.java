import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public int lengthOfLISDP(int[] nums) {
    	//nlog(n)
        int len = 0;
        int[] dp = new int[nums.length];
        
        for(int n:nums){
            int index = Arrays.binarySearch(dp,0,len,n);

            if(index<0){
                index = -(index+1);
            }
            dp[index] = n;
            if(len==index){
                len++;
            }
        }
        
            return len;
    }   
    
    public int lengthOfLIS(int[] nums) {
    	//2^n
        return lengthOfLISRecursive(nums, Integer.MIN_VALUE,0);
    }
    
    public int lengthOfLISRecursive(int[] nums,int prev, int index) {
        if(index >=nums.length){
            return 0;
        }
        int pick = 0;
        if(nums[index] >prev){
            pick = lengthOfLISRecursive(nums,nums[index],index+1)+1;
        }
        int skip = lengthOfLISRecursive(nums,prev,index+1);
        return Math.max(pick,skip);
    }
}
