import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for(int i =left;i<=right;i++){
    		int current =i;
    		boolean flag = true;
    		while(current!=0){
    			if (current%10==0){
    				flag = false;
    				break;
    			}
    			else{
    				if(i%(current%10)!=0){
    					flag = false;
    				}
    			}
    			current =current/10;
    			
    		}
    		if(flag){
    			list.add(i);
    			}

    	}
    	return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelfDividingNumbers s= new SelfDividingNumbers();
		System.out.println(s.selfDividingNumbers(1, 22).toString());

	}

}
