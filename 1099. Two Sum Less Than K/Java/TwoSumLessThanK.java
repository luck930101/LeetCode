
public class TwoSumLessThanK {
	public int twoSumLessThanK(int[] A, int K) {
		int result = -1;
		
		for(int i = 0; i < A.length -1 ; i++){
			for(int j = i+1; j < A.length ; j++){
				if (A[i] + A[j]< K && A[i] + A[j] > result){
					result = A[i] + A[j];
				}
				
			}
		}
		
		
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
