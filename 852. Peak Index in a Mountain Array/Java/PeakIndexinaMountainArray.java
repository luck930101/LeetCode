
public class PeakIndexinaMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        for (int i =0;i<A.length-1;i++){
        	if(A[i+1]<A[i]){
        		return i;
        	}
        }   
        
        return A.length-1;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
