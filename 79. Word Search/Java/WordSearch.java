
public class WordSearch {

	public boolean exist(char[][] board, String word) {
        boolean result = false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board[0].length;j++){  
                result = result ||findNext(board,visited,word,i,j,0);
            }
        }
        return result;
    }
    
    public boolean findNext(char[][] board,boolean[][] visited, String word, int i, int j, int index){
        if(index >= word.length()){return true;}
        if(i<0 ||i>=board.length||j<0||j>=board[0].length){return false;}
        if(visited[i][j]){return false;}
        boolean current = false;
        if(board[i][j]==word.charAt(index)){
            visited[i][j] = true;
        	current = current||findNext(board,visited,word,i-1,j,index+1);
        	current = current||findNext(board,visited,word,i,j-1,index+1);
        	current = current||findNext(board,visited,word,i+1,j,index+1);
        	current = current||findNext(board,visited,word,i,j+1,index+1);
        }
        visited[i][j] = false;
        return current;
    }

}
