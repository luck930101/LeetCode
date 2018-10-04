
public class FlippinganImage {
	
    public int[][] flipAndInvertImage(int[][] A) {
    	int row = A.length;
    	int column = A[0].length;
        int [][] result =  new int[row][column];
        
        for(int i = 0; i<row;i++){
            for(int j = 0; j<column;j++){
            	result[i][j] = 1 - A[i][column-1-j];
            }
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]A = {{1,1,0},{1,0,1},{0,0,0}};
		FlippinganImage fi = new FlippinganImage();
		fi.flipAndInvertImage(A);

	}

}
