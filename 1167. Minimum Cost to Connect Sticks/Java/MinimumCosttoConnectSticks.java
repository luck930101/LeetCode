import java.util.PriorityQueue;

public class MinimumCosttoConnectSticks {
	public int connectSticks(int[] sticks) {
        int cost = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for(int length:sticks){
            heap.add(length);
        }
        while(heap.size()>1){
            int min1 = heap.poll();
            int min2 = heap.poll();
            int combine = min1+min2;
            cost+=combine;
            heap.add(combine);
        }
        
        return cost;
    }
}
