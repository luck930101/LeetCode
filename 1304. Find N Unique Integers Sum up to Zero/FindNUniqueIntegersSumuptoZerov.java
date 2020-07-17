
public class FindNUniqueIntegersSumuptoZerov {
	public int[] sumZero(int n) {
        
        int [] result = new int[n];
        int num = (n-1)*(-1);
        for(int i = 0;i<n;i++){
            result[i] = num;
            num +=2;
        }
        return result;
    }
}
