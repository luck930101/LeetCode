
public class CountSquareSubmatriceswithAllOnes {
	int count = 0;
    public int countSquares(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
           for(int j = 0; j < matrix[0].length; j++){
               int size = 1;
               while(isSquares(matrix,i,j,size)){
                   size++;
               }
            } 
        }
        return count;
    }
    
    
    public boolean isSquares(int[][] matrix,int r, int c, int size) {
        for(int i =r ; i <r+size; i ++){
            for(int j =c ; j <c+size; j ++){
                if(i>=matrix.length||j>=matrix[0].length||matrix[i][j]==0){
                    return false;
                }
            }
        }
        count++;
        return true;
    }
}
