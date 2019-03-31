
public class MonotonicArray {
	
	public boolean isMonotonic(int[] A) {
		boolean order = true;
		boolean reverse = true;
		
		if((!order&&!reverse)){
            return false;
        }
		
		for(int i = 0; i < A.length-1;i++){
			if(A[i]<A[i+1]){
				order = false;
			}
			if(A[A.length-1-i]<A[A.length-1-i-1]){
				reverse = false;
			}
            
        }
        return order||reverse;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
