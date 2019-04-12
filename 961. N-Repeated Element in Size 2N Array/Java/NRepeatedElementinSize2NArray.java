
public class NRepeatedElementinSize2NArray {
	
    public int repeatedNTimesv1(int[] A) {
        int[] resultarray = new int[10000];
        for(int i = 0;i<resultarray.length;i++){
            resultarray[i] = -1;
        }
        for(int i = 0;i<A.length;i++){
            if (resultarray[A[i]]==A[i]){
                return A[i];
            }
            else{
                resultarray[A[i]]=A[i];
            }
        }
        return A[A.length/2+1];
    }
    
    public int repeatedNTimesv2(int[] A) {

        boolean [] resultarray = new boolean[10000];

        for(int i = 0;i<A.length;i++){
            if (resultarray[A[i]]==true){
                return A[i];
            }
            else{
                resultarray[A[i]]=false;
            }
        }
        return A[A.length/2+1];

    }
    
    public int repeatedNTimesv3(int[] A) {

        boolean [] resultarray = new boolean[10000];

        for(int i = 0;i<A.length;i++){
            if (resultarray[A[i]]==true){
                return A[i];
            }
            else{
                resultarray[A[i]]=false;
            }
        }
        return A[A.length/2+1];

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
