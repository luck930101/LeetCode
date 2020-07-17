import java.util.Arrays;

public class MakeTwoArraysEqualbyReversingSubarrays {
	public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length){return false;}
        Arrays.sort(target);
        Arrays.sort(arr);
        
        for(int i = 0 ; i< target.length;i++){
            if(arr[i]!=target[i]){
                return false;
            }
        }
        return true;
    }
}
