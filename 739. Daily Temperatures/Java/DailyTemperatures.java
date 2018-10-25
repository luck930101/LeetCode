
public class DailyTemperatures {
	public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        loop:for(int i = 0;i<T.length -1;i++){
        	int count =1;
        	for(int j = i;j<T.length;j++){
        		if(T[j]>T[i]){
        			result[i] = count;
        			continue loop;
        		}
        		count++;
        	}
        	result[i]=0;
        }
        
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
