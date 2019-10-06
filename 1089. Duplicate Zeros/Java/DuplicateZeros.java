
import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros {
	
	public void duplicateZeros(int[] arr) {
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i : arr ){
			if(i == 0){
				queue.add(0);
				queue.add(0);
			}
			else{
				queue.add(i);
			}
			
		}
		int j = 0;
		while(j<arr.length){
			arr[j]=queue.poll();
		}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
