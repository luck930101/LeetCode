import java.util.Stack;

public class WallsandGates {
	final int inf = 2147483647;
    public void wallsAndGates(int[][] rooms) {
        Stack<int[]> s = new Stack<int[]>();
        for(int i = 0; i<rooms.length;i++){
            for(int j = 0; j<rooms[0].length;j++){
                if(rooms[i][j]==0){
                    int[] index = {i,j};
                    s.push(index);
                }
            }
        }
        
        while(!s.isEmpty()){
            int[] index = s.pop();
            fill(rooms,1,index[0]-1,index[1]);
            fill(rooms,1,index[0],index[1]-1);
            fill(rooms,1,index[0]+1,index[1]);
            fill(rooms,1,index[0],index[1]+1);
        }
    }
    
    public void fill(int[][] rooms,int distance,int i, int j) {
        if(i<0||i>=rooms.length||j<0||j>=rooms[0].length||rooms[i][j]==-1||rooms[i][j]==0||rooms[i][j]<=distance){
            return;
        }
        else{
            rooms[i][j] = distance;
            fill(rooms,distance+1,i-1,j);
            fill(rooms,distance+1,i,j-1);
            fill(rooms,distance+1,i+1,j);
            fill(rooms,distance+1,i,j+1);
        }
    }
    
    
    public boolean isFinished(int[][] rooms) {
        for(int i = 0; i<rooms.length;i++){
            for(int j = 0; j<rooms[0].length;j++){
                if(rooms[i][j]==inf){
                    return false;
                }
            }
        }
        return true;
    }
}
