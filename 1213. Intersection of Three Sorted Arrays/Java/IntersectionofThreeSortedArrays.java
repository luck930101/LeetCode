import java.util.LinkedList;
import java.util.List;

public class IntersectionofThreeSortedArrays {
	
	public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
		int[] array = new int[2000];
        List<Integer> result = new LinkedList<Integer>();
        
        for(int i :arr1){array[i-1]++;};
        for(int i :arr2){array[i-1]++;};
        for(int i :arr3){array[i-1]++;};
        
        for(int i = 0; i<2000;i++){
        	if(array[i]==3){result.add(i+1);}
        }
        return result;
        
    }
	
	
}
