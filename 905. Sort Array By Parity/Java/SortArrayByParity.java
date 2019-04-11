
public class SortArrayByParity {
	public int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int front =0;
        int rear =0;
        for (int i : A){
        	if(i%2==0){
        		result[front] = i;
        		front++;
        	}
        	else{
        		result[A.length-1-rear] = i;
        		rear++;
        	}
        }
        
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
