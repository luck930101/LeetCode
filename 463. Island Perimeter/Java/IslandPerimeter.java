
public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
		int perimeter = 0;
		for(int i = 0;i < grid.length;i++){
			for(int j = 0;j < grid[0].length;j++){
				if (grid[i][j]==1){
					if(i == 0){
						perimeter++;
					}
					if(i ==grid.length-1){
						perimeter++;
					}
					if(j == 0){
						perimeter++;
					}
					if(j ==grid[0].length-1){
						perimeter++;
					}
					if(i<grid.length-1){
						if(grid[i+1][j]==0){
							perimeter++;
						}
					}
					if(j<grid[0].length-1){
						if(grid[i][j+1]==0){
							perimeter++;
						}
					}
					if(i>=1){
						if(grid[i-1][j]==0){
							perimeter++;
						}
					}
					if(j>=1){
						if(grid[i][j-1]==0){
							perimeter++;
						}
					}	
				}
			}
		}
        return perimeter;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] island = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int [][] island2 = {{1}};
		IslandPerimeter ip = new IslandPerimeter();
		System.out.println(ip.islandPerimeter(island));
		

	}

}
