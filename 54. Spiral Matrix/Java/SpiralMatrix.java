import java.util.ArrayList;
import java.util.List;
public class SpiralMatrix {
	int directioncount = 0;
	int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
    List<Integer> result = new ArrayList<Integer>();
    
	public List<Integer> spiralOrder(int[][] matrix) {
		nextstep(0,0,matrix);
        return result;
    }
	
	public boolean nextstep(int i, int j, int[][] matrix) {
		if(i<0 || j < 0 || i>= matrix.length|| j >=matrix[0].length||matrix[i][j] == Integer.MIN_VALUE){
			return false;
		}
		else{
			result.add(matrix[i][j]);
			matrix[i][j] = Integer.MIN_VALUE;
			if(!nextstep(i+direction[directioncount%4][0],j+direction[directioncount%4][1],matrix)){
				directioncount++;
				return nextstep(i+direction[directioncount%4][0],j+direction[directioncount%4][1],matrix);
			};
			return true;
		}
    }
}
