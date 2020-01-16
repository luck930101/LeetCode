
public class NumberofIslands {
	public int numIslands(char[][] grid) {
        int count = 0;
        
        for(int i =0;i < grid.length;i++){
        	for (int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] =='1'){
					count++;
					removeIslands(i, j, grid);
				}
			}
        }
        return count;
    }
	
	public void removeIslands(int i, int j, char[][] grid) {
		if(i < grid.length && i>=0 && j < grid[0].length && j>=0 ){
			if(grid[i][j]=='1'){
				grid[i][j] ='0';
				removeIslands(i-1, j, grid);
				removeIslands(i+1, j, grid);
				removeIslands(i, j-1, grid);
				removeIslands(i, j+1, grid);
				
			}
		}
    }
}
