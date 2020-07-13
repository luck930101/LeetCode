import java.util.Arrays;

public class PartitionEqualSubsetSum {
	public boolean canPartition(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int n :nums){
            sum+= n;
        }
        if(sum%2==1){
            return false;
        }
        
        return dfs(nums,0,sum/2);
    }
    
    public boolean dfs(int[] nums,int index,int target) {
        if(target == 0 ){
            return true;
        }
        if(index==nums.length||target<0){
            return false;
        }
        if(dfs(nums,index+1,target-nums[index])){
            return true;
        }
        
        int i=index +1;
        while(i<nums.length&&nums[i]==nums[index]){
            i++;
        }
        
        return dfs(nums,i,target);
    }
}
