
public class FibonacciNumber {
	public int fibRecursive(int N) {
        if(N ==0){
        	return 0;
        }
        if(N == 1){
        	return 1;
        }
        
        return fibRecursive(N-1)+fibRecursive(N-2);
        
    }
	
	public int fibIterative(int N) {
		if(N == 0||N == 1){
			return N;
		}

		int pre = 0;
		int mid = 1;
		int post = 1;
		
		for(int i = 0; i< N-2;i++){
			pre = mid;
			mid = post;
			post = pre+mid;
		}
        return post;
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
