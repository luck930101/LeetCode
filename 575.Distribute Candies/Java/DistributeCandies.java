import java.util.Arrays;

public class DistributeCandies {
	public int distributeCandies(int[] candies) {
		Arrays.sort(candies);
		int diffcount = 0;
		for(int i = 1;i < candies.length;i++){
			if (candies[i]!=candies[i-1]){
				diffcount++;
			}
		}
       return Math.min(candies.length/2, diffcount);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
