
public class SquaresofaSortedArray {
	
	public int[] sortedSquares(int[] A) {
		int array[] = new int[A.length];
		int front = 0;
		int rare = A.length-1;
		for(int i = A.length-1; i>=0;i--){
			if(Math.abs(A[front])>Math.abs(A[rare])){
				array[i]=A[front]*A[front];
				front++;
			}
			else{
				array[i]=A[rare]*A[rare];
				rare--;
			}
		}
        return array;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {-4, -1};
		SquaresofaSortedArray ssa = new SquaresofaSortedArray();
		ssa.sortedSquares(array);
		System.out.println(ssa);
	}

}
