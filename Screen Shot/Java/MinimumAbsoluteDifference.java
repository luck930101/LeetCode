import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    	List<List<Integer>> result = new ArrayList();
    	
    	Arrays.sort(arr);
    	int minvalue = arr[1]-arr[0];
    	for(int i = 0;i< arr.length-1;i++){
    		minvalue = Math.min(minvalue, arr[i+1]-arr[i]);
    	}
    	System.out.println(minvalue);
    	for(int i = 0;i< arr.length-1;i++){
    		if(arr[i+1]-arr[i] == minvalue){
    	    	List<Integer> newpair = new ArrayList();
    	    	newpair.add(arr[i]);
    	    	newpair.add(arr[i+1]);
        		result.add(newpair);
    	    	
    		}

    	}

		return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array =  {4,2,1,3};
		MinimumAbsoluteDifference m= new MinimumAbsoluteDifference();
		System.out.println(m.minimumAbsDifference(array));

	}

}
