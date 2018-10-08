
public class SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
    	int max =A[0];
    	int min =A[0];
    	for (int i =0;i<A.length;i++){
    		max = (max>A[i])?max:A[i];
    		min = (min<A[i])?min:A[i];
    	}

        return (max - min<2*K)?0:max - min -2*K;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
