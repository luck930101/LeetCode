
public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<9;i++){
            int[] row = new int[9];
            int[] column = new int[9];
            int[] cube = new int[9];
            
            for(int j = 0;j<9;j++){
                //check row

                if(board[i][j]!='.')
                {
                    if(row[board[i][j]-'0'-1]!=0){
                        return false;
                    }
                    else{
                        row[board[i][j]-'0'-1]=1;
                    }
                }
                //check column
                if(board[j][i]!='.'){
                    if(column[board[j][i]-'0'-1]!=0){
                        return false;
                    }
                    else{
                        column[board[j][i]-'0'-1]=1;
                    }
                }
                //check cube    
                if(board[j/3+i/3*3][j%3+i%3*3]!='.'){
                    if(cube[board[j/3+i/3*3][j%3+i%3*3]-'0'-1]!=0){
                        return false;
                    }
                    else{
                        cube[board[j/3+i/3*3][j%3+i%3*3]-'0'-1]=1;
                    }
                }
            }
        }
        
        return true;
    }
}
