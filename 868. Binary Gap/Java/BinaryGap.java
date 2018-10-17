
public class BinaryGap {
	public int binaryGap(int N) {
		int distance = Integer.MIN_VALUE;
		int max = 0;
		while(N > 0){
			
			if (N%2 == 1){
				max = Math.max(max, distance);
				distance = 1;
			}
			else{
				distance++;
			}
			N = N / 2;
		}
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryGap bg = new BinaryGap();
		System.out.println(bg.binaryGap(22));
		System.out.println(bg.binaryGap(6));
		System.out.println(bg.binaryGap(8));

	}

}
