
public class JumpGame {
	public boolean canJump(int[] nums) {
        int maxreach =0;
        for(int i = 0 ;i<nums.length;i++){
            if(maxreach<i){return false;}
            maxreach = Math.max(nums[i]+i,maxreach);
        }
        return true;
    }
}
