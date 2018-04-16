
public class HammingDistance {
    public int hammingDistance(int x, int y) {
    	int xor = x^y;
    	int count = 0;
    	for(int i =0;i<32;i++){
    		count += (xor&1);
    		xor >>=  1;
    	}
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HammingDistance hd = new HammingDistance();
		System.out.println(hd.hammingDistance(1, 4));
	}

}
