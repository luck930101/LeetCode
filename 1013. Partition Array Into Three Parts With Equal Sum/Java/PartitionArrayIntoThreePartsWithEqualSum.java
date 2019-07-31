
public class PartitionArrayIntoThreePartsWithEqualSum {
	
	public boolean canThreePartsEqualSum(int[] A) {
		
		int sum = 0;
		int partition = 0;
		int flag = 0;
		for (int i = 0; i < A.length;i++){
			sum += A[i]; 
		}
		if(sum%3!=0){
			return false;
		}
		
		for (int i = 0; i < A.length;i++){
			partition += A[i];
			if (partition == sum/3){
				partition = 0;
				flag++;
			}
		}
		
        return partition==0&&flag==3;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
