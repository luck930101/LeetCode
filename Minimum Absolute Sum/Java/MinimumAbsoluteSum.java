import java.util.Arrays;

public class MinimumAbsoluteSum {
	
    public int[] minimumAbsSum(int[] arr) {
    	int minvalue = Integer.MAX_VALUE;
    	Arrays.sort(arr);
    	int left = 0;
    	int low = 0;
    	int right = arr.length-1;
    	int high = arr.length-1;
    	
    	while(right>left){
    		if(Math.abs(arr[left]+arr[right])<minvalue){
    			minvalue = Math.abs(arr[left]+arr[right]);
    			low = left;
    			high = right;
    		}
    		else{
    			if(arr[left]+arr[right]<0){left++;}
    			else if(arr[left]+arr[right]>0){right--;}
    			else{
    				low = left;
    				high = right;
    				break;}
    		}
    	}
    	    	
    	int result[] = {arr[low],arr[high]};
    	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {-6,-5,-3,0,2,4,9};
		MinimumAbsoluteSum m = new MinimumAbsoluteSum();
		int[] result = m.minimumAbsSum(array);
		System.out.println("("+result[0] + ","+ result[1]+")");
		

	}

}
