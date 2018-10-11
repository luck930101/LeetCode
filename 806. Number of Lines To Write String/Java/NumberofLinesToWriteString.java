
public class NumberofLinesToWriteString {
	public int[] numberOfLines(int[] widths, String S) {
		int[] result = new int[2];
		int emptyspace =100;
		int linecount = 1;
		
		for(int i = 0; i<S.length();i++){
			if (emptyspace>=widths[(int)S.charAt(i)-97]){
				emptyspace-=widths[(int)S.charAt(i)-97];
			}
			else{
				linecount++;
				emptyspace =100 - widths[(int)S.charAt(i)-97];
			}
		}
		result[0] = linecount;
		result[1] = 100-emptyspace;
        return result;
    }

	public static void main(String[] args) {
		NumberofLinesToWriteString nlws = new NumberofLinesToWriteString();
		int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S = "abcdefghijklmnopqrstuvwxyz";
		
		int[] widths2 = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S2 = "bbbcccdddaaa";
		nlws.numberOfLines(widths2, S2);

	}

}
