
public class ReshapetheMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c!= nums.length*nums[0].length) {
            return nums;
        }
        
        int [][] result = new int [r][c];
        int index =0;
        for(int i = 0;i<nums.length;i++){
        	for(int j = 0;j<nums[0].length;j++,index++){
        		result[index/c][index%c]=nums[i][j];
        	}
        }
        return result;
    }

	public static void main(String[] args) {
		ReshapetheMatrix rm = new ReshapetheMatrix();
		int [][] array = {{1,2},{3,4}};
		
		// TODO Auto-generated method stub

	}

}
