
public class RelativeSortArray {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] dict = new int[1001];
        int[] result = new int[arr1.length];
        for(int i = 0; i < arr1.length;i++){
            dict[arr1[i]]++;
        }
        int index = 0;
        for(int i = 0; i < arr2.length;i++){
            while(dict[arr2[i]]>0){
                result[index] = arr2[i];
                dict[arr2[i]]--;
                index++;
            }
        }
        
        for(int i = 0; i < dict.length;i++){
            while(dict[i]>0){
                result[index] = i;
                dict[i]--;
                index++;
            }
        }
        
        return result;
    }
}
