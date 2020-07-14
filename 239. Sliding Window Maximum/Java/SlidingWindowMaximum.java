import java.util.ArrayDeque;

public class SlidingWindowMaximum {
	/*
	解题思路分析
	如果没有思路， 先从特殊情况开始， 对于这个题目， 主要是两种特殊情况, 一种是递增的，一种是递减的
	比如下面这样， 假设窗口k=2
	[1,2,3,4,5] –> [2,3,4,5]
	[5,4,3,2,1] –> [5,4,3,2]
	可以看到，如果是递增的数组，每次遇到一个新的数， 这个数就是当前窗口的最大值；
	而如果是递减的数组，每次遇到一个新的数，最大值都是当前窗口上最左边的数；

	所以这里的核心逻辑是， 如果遇到一个更大的数，那么前面的更小的数这个信息已经没有用了；如果遇到一个更小的数，那么之前的信息和当前的信息都是有用的， 因为前面的较大的数不在窗口里面以后，当前数有可能变成更大的数。
	比如例子里面的极端情况， 如果每次遇到的数都是到目前为止最大的数， 那么前面所有的数都不需要保存，直接保存当前数作为最大的数就好；

	所以，可以用一个linkedlist保存这个信息， 每次遇到一个数，比较list里面的数的大小，如果当前数比较大，就把前面的数剔除。
	因为我们需要判断list里面的数是否在窗口里面，所以list里面需要保存index
	*/

	public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums ==null || nums.length==1){
            return nums;
        }
        
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        
        int[] result = new int [nums.length -k +1];
        
        for(int i = 0; i < nums.length;i++){
            if(!dq.isEmpty()&&(dq.peek()<i-k+1)){
                dq.poll();
            }
            while(!dq.isEmpty()&&nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            
            dq.offer(i);
            
            if(i >= k - 1){
                result[i-k+1] = nums[dq.peek()];
            }
        }
        
        return result;
    }

}
