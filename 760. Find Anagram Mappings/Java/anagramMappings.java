import java.util.Arrays;

public class AnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        int size = A.length;
        int[] result = new int[size];
        for (int i =0;i<size;i++){
            for (int j =0;j<size;j++){
                if(A[i]==B[j]){
                    result[i]=j;
                }
            }
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnagramMappings newclass = new AnagramMappings();
		int[] A = {12, 28, 46, 32, 50};
		int[] B = {50, 12, 32, 46, 28};
		System.out.println(Arrays.toString(newclass.anagramMappings(A,B)));

	}

}
