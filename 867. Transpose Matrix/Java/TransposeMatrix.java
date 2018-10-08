
public class TransposeMatrix {
	public int[][] transpose(int[][] A) {
		int[][] transposematrix = new int[A[0].length][A.length];
		for(int i = 0;i < A[0].length;i++){
			for(int j = 0;j < A.length;j++){
				transposematrix[i][j]=A[j][i];
			}
			
		}
		return transposematrix;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
