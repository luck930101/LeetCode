
public class BinaryNumberwithAlternatingBits {
	public boolean hasAlternatingBits(int n) {
		int currentbit = -1;
		while(n!=0){
			if(n%2 == currentbit){
				return false;
			}
			currentbit = n%2;
			n = n/2;
		}
        return true;
//        n = n ^ (n>>1);
//        return (n & n+1) == 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryNumberwithAlternatingBits bnab = new BinaryNumberwithAlternatingBits();
		System.out.println(bnab.hasAlternatingBits(5));
		System.out.println(bnab.hasAlternatingBits(7));
		System.out.println(bnab.hasAlternatingBits(11));
		System.out.println(bnab.hasAlternatingBits(10));
		System.out.println(bnab.hasAlternatingBits(0));

	}

}
