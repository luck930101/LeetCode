
public class MaxIncreasetoKeepCitySkyline {
	
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int output = 0;
        int [] fromtop = new int[grid.length];
        int [] fromleft = new int[grid[0].length];
        
        for(int j =0;j<grid[0].length;j++){
        	int max =0;
        	for(int i =0;i<grid.length;i++){
        		if (grid[i][j] > max){
        			max = grid[i][j];
        		}
        	}
        	fromtop[j]=max;
        }
        
        for(int j =0;j<grid.length;j++){
        	int max =0;
        	for(int i =0;i<grid[0].length;i++){
        		if (grid[j][i] > max){
        			max = grid[j][i];
        		}
        	}
        	fromleft[j]=max;
        }
        
        for(int i =0;i<grid.length;i++){
        	for(int j =0;j<grid[0].length;j++){
        		output+= Math.min(fromtop[j], fromleft[i])-grid[i][j];
        	}

        }
        
        return output;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		MaxIncreasetoKeepCitySkyline m = new MaxIncreasetoKeepCitySkyline();
		int output = m.maxIncreaseKeepingSkyline(grid);
		System.out.println(output);


	}

}
