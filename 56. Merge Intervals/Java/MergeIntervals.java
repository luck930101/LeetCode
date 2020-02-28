import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
		if(intervals.length<=1){return intervals;}
		Arrays.sort(intervals, (a , b)-> Integer.compare(a[0], b[0])) ;
		ArrayList<int[]> result = new ArrayList<int[]>();
		int[] newinterval = intervals[0];
		for(int i = 0 ; i < intervals.length;i++){
			if(intervals[i][0]>newinterval[1]){
				result.add(newinterval);
				newinterval = intervals[i];
			}
			else{
				newinterval[1] = Math.max(newinterval[1],intervals[i][1] );
			}
		}
        result.add(newinterval);
		
        return result.toArray(new int[result.size()][]);
    }
}
