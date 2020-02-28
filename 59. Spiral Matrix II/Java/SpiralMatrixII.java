
public class SpiralMatrixII {
    int directioncount = 0;
    int[][] direction = {{0,1},{1,0},{0,-1},{-1,0}};
    int number = 1;
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        add(0,0,result);
        return result;
    }
    
    public boolean add(int i , int j , int[][] grid){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j]!=0)
        {
            return false;
        }
        else{
            grid[i][j] = number;
            number++;
            if(!add(i+direction[directioncount%4][0], j +direction[directioncount%4][1],grid)){
                directioncount++;
                return add(i+direction[directioncount%4][0], j +direction[directioncount%4][1],grid);
            }
            return true;
        }       
    } 
}
