
public class NumberComplement {
	
    public int findComplement(int num) {
    	
    	return ~num+(Integer.highestOneBit(num)<<1);
    	//Integer.highestOneBit() 取二进制最高位
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberComplement nc = new NumberComplement();
		System.out.println(nc.findComplement(5));
		
		System.out.println(nc.findComplement(1));
	}
	

}
