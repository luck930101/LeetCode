import java.util.ArrayDeque;

public class SlidingWindowMaximum {
	/*
	����˼·����
	���û��˼·�� �ȴ����������ʼ�� ���������Ŀ�� ��Ҫ�������������, һ���ǵ����ģ�һ���ǵݼ���
	�������������� ���贰��k=2
	[1,2,3,4,5] �C> [2,3,4,5]
	[5,4,3,2,1] �C> [5,4,3,2]
	���Կ���������ǵ��������飬ÿ������һ���µ����� ��������ǵ�ǰ���ڵ����ֵ��
	������ǵݼ������飬ÿ������һ���µ��������ֵ���ǵ�ǰ����������ߵ�����

	��������ĺ����߼��ǣ� �������һ�������������ôǰ��ĸ�С���������Ϣ�Ѿ�û�����ˣ��������һ����С��������ô֮ǰ����Ϣ�͵�ǰ����Ϣ�������õģ� ��Ϊǰ��Ľϴ�������ڴ��������Ժ󣬵�ǰ���п��ܱ�ɸ��������
	������������ļ�������� ���ÿ�������������ǵ�ĿǰΪֹ�������� ��ôǰ�����е���������Ҫ���棬ֱ�ӱ��浱ǰ����Ϊ�������ͺã�

	���ԣ�������һ��linkedlist���������Ϣ�� ÿ������һ�������Ƚ�list��������Ĵ�С�������ǰ���Ƚϴ󣬾Ͱ�ǰ������޳���
	��Ϊ������Ҫ�ж�list��������Ƿ��ڴ������棬����list������Ҫ����index
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
