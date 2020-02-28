
public class MaxAreaofIsland {
	int max = 0;
	int currentmax =0;
	public int maxAreaOfIsland(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				addArea(i,j,grid);
				max = Math.max(max, currentmax);
				currentmax =0;
			}
		}
		return max;
    }
	
	public void addArea(int i, int j, int[][] grid){
		if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
			return;
		}
		else{
			if(grid[i][j] ==1){
				currentmax++;
                grid[i][j] = 0;
				addArea(i-1, j , grid);
				addArea(i+1, j , grid);
				addArea(i, j-1 , grid);
				addArea(i, j+1 , grid);
			}
		}
	}
}
