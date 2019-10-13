import java.util.Arrays;

public class LargestPerimeterTriangle {
	public int largestPerimeter(int[] A) {
		Arrays.sort(A);
		for(int i = A.length-1;i>1;i--){
			if(A[i-2]>A[i]-A[i-1]){
				return A[i]+A[i-1]+A[i-2];
			}
		}
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
