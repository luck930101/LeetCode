public class MissingNumberInArithmeticProgression {
	
	public int missingNumber(int[] arr) {
		int gap = (arr[arr.length-1]-arr[0])/arr.length;
		for(int i = 0; i <arr.length;i++){
			if(arr[i]!=arr[0]+i*gap){return arr[0]+i*gap;};
		}
        return 0;
    }



}
