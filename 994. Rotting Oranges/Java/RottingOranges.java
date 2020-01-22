import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
	public int orangesRotting(int[][] grid) {
		int rounds = 0;
		int increase = 1;
		while(!ifAllRotten(grid)&&increase!=0){
			increase = rot(grid);
            System.out.println("1");
			rounds++;
		}
		
		int count = 0;
		for(int i =0; i< grid.length;i++){
			for(int j =0; j< grid[0].length;j++){
				if(grid[i][j]==1){
				    count++;
				}
			}
		}
		rounds = (count==0)?rounds:-1;
        return rounds;
    }
	
	public boolean ifAllRotten(int[][] grid) {
		for(int i =0; i< grid.length;i++){
			for(int j =0; j< grid[0].length;j++){
				if(grid[i][j]==1){
					return false;
				}
			}
		}
		return true;
    }
	
	public int rot(int[][] grid) {
		int increase =0;
		Queue<int[]> queue = new LinkedList<int[]>();
		for(int i =0; i< grid.length;i++){
			for(int j =0; j< grid[0].length;j++){
				if(grid[i][j]==2){
					queue.offer(new int[]{i,j});
				}
			}
		}
		
		while(!queue.isEmpty()){
			int[] rottenorangge = queue.poll();
			increase += rotNext(grid,rottenorangge[0]-1,rottenorangge[1]);
			increase += rotNext(grid,rottenorangge[0],rottenorangge[1]-1);
			increase += rotNext(grid,rottenorangge[0]+1,rottenorangge[1]);
			increase += rotNext(grid,rottenorangge[0],rottenorangge[1]+1);
		}
		return increase;
    }
	
	public int rotNext(int[][] grid, int i, int j) {
		if(i>=0&&i<grid.length&&j>=0&&j<grid[0].length&&grid[i][j]==1){
			grid[i][j]=2;
			return 1;
		}
		return 0;
    }

}
