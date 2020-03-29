
public class SetMatrixZeroes {
public void setZeroes(int[][] matrix) {
        
        boolean firstrow = false;
        boolean firstcolumn = false;
        
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    if(i==0){firstrow = true;}
                    if(j==0){firstcolumn = true;}
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for(int i = 1;i<matrix.length;i++){
            if(matrix[i][0]==0){
                for(int j =1;j<matrix[0].length;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        for(int j = 1;j<matrix[0].length;j++){
            if(matrix[0][j]==0){
                for(int i =1;i<matrix.length;i++){
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(firstrow){
            for(int j = 0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }
        
        if(firstcolumn){
            for(int i = 0;i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }
        
    }
}
