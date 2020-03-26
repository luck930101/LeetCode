import java.util.PriorityQueue;

public class KClosestPointstoOrigin {
	public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>((p1,p2)->p1[0]*p1[0]+p1[1]*p1[1]-p2[0]*p2[0]-p2[1]*p2[1]);
        
        for(int[] p:points){
            heap.add(p);
        }
        int[][] result = new int[K][2];
        for(int i = 0;i<K;i++){
            result[i] = heap.poll();
        }
        
        return result;
    }
}
