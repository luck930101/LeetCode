import java.util.HashSet;

public class HappyNumber {
	public static boolean isHappy(int n) {
		int current =n;
		HashSet<Integer> set = new HashSet<Integer>();
		while(!set.contains(current)){
			set.add(current);
			int result = 0;
			while(current>0){
				result+=(current%10)*(current%10);
				current = current/10;	
			}
			current = result;
			if(current==1){return true;}
			
		}
        return false; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isHappy(103);

	}

}
