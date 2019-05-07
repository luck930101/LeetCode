
public class SortArrayByParityII {
	public int[] sortArrayByParityII1(int[] A) {
		int even = 0;
		int odd = 1; 
		int[] result = new int[A.length];
		
		for (int i: A){
			if (i%2==0){
				result[even] = i;
				even +=2;
			}
			else{
				result[odd] = i;
				odd +=2;
				}
	
		}
		return result;
	}
	
//	public int[] sortArrayByParityII2(int[] A) {
//		int even = 0;
//		int odd = A.length-1; 
//		
//		while (even < A.length && odd >0 ){
//			while (A[even]%2==0){
//				even+=2;
//			}
//			while (A[odd]%2!=0){
//				odd-=2;
//			}
//			
//			if(A[even]%2==0 && A[odd]%2!=0){
//				int temp = A[even];
//				A[even] = A[odd];
//				A[even] = temp;
//			}
//		}
//		return A;
//	}
}
