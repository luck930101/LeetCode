import java.util.Arrays;

public class RemoveCoveredIntervals {
	public int removeCoveredIntervals(int[][] intervals) {
        int count = 0;
        int maxright = 0;
        Arrays.sort(intervals,(i,j)->(i[0]==j[0])?j[1]-i[1]:i[0]-j[0]);
        
        for(int i =0;i<intervals.length;i++){
            if(maxright<intervals[i][1]){
                count++;
                maxright = intervals[i][1];
            }
        }
        return count;
    }
}
