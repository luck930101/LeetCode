import java.util.Arrays;

public class SpiralMatrixIII {
	public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] result = new int[R*C][2];
        int fillcounter = 0;
        int currentrow = r0;
        int currentcolumn = c0;
        int maxmoveinonedirection=1;
        int nthturn =0;
        int moveinonedirection =1;
        int[][] directionmap={{0,1},{1,0},{0,-1},{-1,0}};
        int direction = 0;
        while(fillcounter<R*C){
        	if(currentrow<=R-1&&currentrow>=0&&currentcolumn<=C-1&&currentcolumn>=0){
        		result[fillcounter][0] = currentrow;
        		result[fillcounter][1] = currentcolumn;
        		fillcounter++;	
        	}
        	if(moveinonedirection>0){
        		currentrow=currentrow+directionmap[direction][0];
            	currentcolumn+=directionmap[direction][1];
            	moveinonedirection--;
        	}
        	if(moveinonedirection==0){
        		nthturn ++;
        		direction = (direction+1>3)?0:(direction+1);
        		maxmoveinonedirection = (nthturn%2==0)?(maxmoveinonedirection+1):maxmoveinonedirection;
        		moveinonedirection = maxmoveinonedirection;
        	}	
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralMatrixIII sm = new SpiralMatrixIII();
//		System.out.println(Arrays.deepToString(sm.spiralMatrixIII(1, 4, 0, 0)));
		System.out.println(Arrays.deepToString(sm.spiralMatrixIII(5, 6, 1, 4)));
	}

}
