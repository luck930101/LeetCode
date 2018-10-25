
public class LongestUncommonSubsequenceI {
	public int findLUSlength(String a, String b) {
       return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
