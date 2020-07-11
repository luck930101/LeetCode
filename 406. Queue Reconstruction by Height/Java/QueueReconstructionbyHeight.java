import java.util.Arrays;
import java.util.LinkedList;

public class QueueReconstructionbyHeight {
	
	public int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people,(p1,p2)->{return p1[0]==p2[0]? p1[1]-p2[1]: p2[0]-p1[0];});
        
        LinkedList<int[]> list = new LinkedList<>();
        
        for(int[] p :people){
            list.add(p[1],p);
        }
            
        return list.toArray(new int[people.length][]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
