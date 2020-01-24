import java.util.PriorityQueue;

public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b)-> b - a);
		
		for(int s :stones){
			queue.add(s);
		}
		while(queue.size()>1){
			int bigger = queue.poll();
			int smaller = queue.poll();
			int result = bigger - smaller;
			if(result>0){queue.add(result);}
			
		}
		
        return queue.size()==0?0:queue.poll();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] st = {2,7,4,1,8,1};
		
		LastStoneWeight l = new LastStoneWeight();
		System.out.println(l.lastStoneWeight(st));

	}

}
