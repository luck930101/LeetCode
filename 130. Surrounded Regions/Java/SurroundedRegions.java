
public class SurroundedRegions {
	public void solve(char[][] board) {
        if(board.length ==0){return;}
        int[][] record = new int[board.length][board[0].length];
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(i == 0 ||i == board.length-1||j==0||j == board[0].length-1){
                    draw(board,record,i,j);
                }
            }
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]=='O'&&record[i][j]==0){
                    board[i][j] = 'X';
                }
            }
        }
    }
    
    public void draw(char[][] board,int[][] record, int i, int j) {
        // System.out.println("a");
        if(i<0||i>=board.length||j<0||j>=board[0].length||record[i][j]==1||board[i][j]=='X'){
            return;
        }
        if(record[i][j]==0&&board[i][j]=='O'){
            record[i][j] =1;
            draw(board,record,i-1,j);
            draw(board,record,i,j-1);
            draw(board,record,i+1,j);
            draw(board,record,i,j+1);
        }
    } 
}
