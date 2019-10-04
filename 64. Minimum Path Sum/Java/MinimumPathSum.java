
public class MinimumPathSum {
	
//    public int minPathSum(int[][] grid) {
//        return recursive(grid,0,0,grid[0][0]);
//    }
//    
//    public int recursive(int[][] grid, int d, int r, int total) {
//    	if (r+d ==grid.length+grid[0].length-2){
//    		return total;
//    	}
//    	if(r==grid[0].length-1){
//    		return recursive(grid,d+1,r,total + grid[d+1][r]);
//    	}
//    	else if (d==grid.length-1){
//    		return recursive(grid,d,r+1,total + grid[d][r+1]);
//    	}
//        return Math.min(recursive(grid,d+1,r,total + grid[d+1][r]),recursive(grid,d,r+1,total + grid[d][r+1]));
//    }
	
//	public int minPathSum(int[][] grid) {
//	  return recursive(grid,grid[0].length-1,grid.length-1);
//	}
//	
//	public int recursive(int[][] grid, int d, int r) {
//		if (r==0&d ==0){
//			return grid[0][0];
//		}
//		if(r==0){
//			return grid[d-1][0]+recursive(grid,d,r);
//		}
//		else if (d==0){
//			return grid[0][r-1]+recursive(grid,d,r);
//		}
//	  return Math.min(grid[d][r]+recursive(grid,d,r-1),grid[d][r]+recursive(grid,d,r-1));
//	}
	public int minPathSum(int[][] grid) {
		for(int d = grid.length-1; d >= 0; d--){
			for(int r = grid[0].length-1;r >= 0;r -- ){
				if (r==grid[0].length-1&d ==grid.length-1){continue;}
				else if(r==grid[0].length-1){grid[d][r] = grid[d+1][r]+grid[d][r];}
				else if(d==grid.length-1){grid[d][r] = grid[d][r+1]+grid[d][r];}
				else{grid[d][r]= grid[d][r]+Math.min(grid[d+1][r],grid[d][r+1]);}
				}
			}
		return grid[0][0];
	}
		  
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
