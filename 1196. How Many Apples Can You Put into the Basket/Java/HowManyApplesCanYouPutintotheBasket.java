import java.util.Arrays;

public class HowManyApplesCanYouPutintotheBasket {
	public int maxNumberOfApples(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int index = 0;
        int cap = 5000;
        for(int i = 0; i < arr.length;i++){
            if(cap>=arr[i]){
                count++;
                cap-=arr[i];
            }
            else{
                return count;
            }
        }
        
        return count;
    }
}
