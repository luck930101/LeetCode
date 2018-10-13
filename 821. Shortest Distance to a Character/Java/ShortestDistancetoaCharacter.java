
public class ShortestDistancetoaCharacter {
	public int[] shortestToChar(String S, char C) {
        int [] result = new int[S.length()];
        for(int i = 0;i<S.length();i++){
        	int prior = (S.substring(0, i).lastIndexOf(C) == -1)?Integer.MAX_VALUE:i-S.substring(0, i).lastIndexOf(C);
        	int later = (S.substring(i, S.length()).indexOf(C)==-1)?Integer.MAX_VALUE:S.substring(i, S.length()).indexOf(C);
        	result[i] = Math.min(prior,later);
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
