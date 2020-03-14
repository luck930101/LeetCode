
public class Searcha2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
	        if(matrix.length==0){return false;}
	        int start = 0;
	        int end = matrix.length* matrix[0].length-1;
	        int mid = (start +end)/2;
	        while(start<=end){
	            if(matrix[mid/matrix[0].length][mid%matrix[0].length]==target){
	                return true;
	            }
	            
	            else if(matrix[mid/matrix[0].length][mid%matrix[0].length]<target){
	                start = mid +1;
	            }
	            
	            else{
	                end = mid -1;
	            }
	            mid = (start +end)/2;
	        }
	        
	        return false;      
	    }  
}
