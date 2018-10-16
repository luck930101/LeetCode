
public class ToeplitzMatrix {
	public boolean isToeplitzMatrix(int[][] matrix) {
		for(int i = 0;i< matrix[0].length-1;i++){
			int row =0;
			int column = i;
			while(row + 1 <= matrix.length-1&&column+1<=matrix[0].length-1){
				if(matrix[row][column] !=matrix[row+1][column+1]){
					return false;
				}
				row++;
				column++;
			}
		}
		
		for(int i = 0;i< matrix.length-1;i++){
			int row =i;
			int column = 0;
			while(row + 1 <= matrix.length-1&&column+1<=matrix[0].length-1){
				if(matrix[row][column] !=matrix[row+1][column+1]){
					return false;
				}
				row++;
				column++;
			}
			
		}
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
