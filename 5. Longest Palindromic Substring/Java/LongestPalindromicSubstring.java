
public class LongestPalindromicSubstring {
	int lowindex = 0;
	int maxlength = 0;
	

	public String longestPalindrome(String s) {
		if(s.length()<2){
			return s;
		}
        for(int i = 0; i <s.length()-1;i++){
        	extendPalindrome(s,i,i);
        	extendPalindrome(s,i,i+1);
        }
        
        return s.substring(lowindex,lowindex+maxlength);
    }
	
	public void extendPalindrome(String s, int left, int right) {

		int l = left;
		int r = right;

		if(l >=0 && r<s.length()&& (s.charAt(l) == s.charAt(r))){
			if(maxlength<r-l+1){
				maxlength = r-l+1;
				lowindex = l;
			}
			extendPalindrome(s,l-1,r+1);
		}  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestPalindromicSubstring l = new LongestPalindromicSubstring();
		System.out.println(l.longestPalindrome("ababd"));
	}

}
