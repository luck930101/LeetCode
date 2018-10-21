import java.util.List;

public class KeysandRooms {
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		int[] visitedarray = new int[rooms.size()];
        DFScanVisitAllRooms(rooms,0,visitedarray);
        for(int i :visitedarray){
        	if(i == 0){
        		return false;
        	}
        }
        
        return true;
    }
	public void DFScanVisitAllRooms(List<List<Integer>> rooms,int roomindex, int[] visitedarray) {
		if (visitedarray[roomindex] ==1){
			return;
		}
		visitedarray[roomindex] = 1;
		for(int i:rooms.get(roomindex)){
			DFScanVisitAllRooms(rooms,i,visitedarray);
		}
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
