
public class CountingBits {
	
    public int[] countBits(int num) {
        int[] list = new int[num+1];
        list [0] = 0;
        for(int i = 1;i< num+1 ;i++){
        	list[i] = (i%2==0)? list[i/2]:list[i/2]+1;
        }
        
        return list;
        
    }

	public static void main(String[] args) {
		CountingBits cb = new CountingBits();
		cb.countBits(5);
		// TODO Auto-generated method stub

	}

}
