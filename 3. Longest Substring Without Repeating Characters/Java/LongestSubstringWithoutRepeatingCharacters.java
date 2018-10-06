
public class LongestSubstringWithoutRepeatingCharacters {
	
    public int lengthOfLongestSubstring(String s) {
    	if (s.equals("")){
    		return 0;
    	}
    	int[] maxlist = new int[s.length()];
    	for (int i = 0;i<s.length();i++){
    		maxlist[i]=1;
    	}
//    	System.out.println("s length" + s.length());
    	for (int i =1; i< s.length();i++){
    		for(int j = i-1; j >= 0; j--){
    			if(s.substring(j+1, i+1).indexOf(s.charAt(j))==(-1)){
//    	    		System.out.println("s.substring(j+1, i).indexOf(s.charAt(j))==(-1):" +(s.substring(j+1, i).indexOf(s.charAt(j))==(-1)));
//    	    		System.out.println("s.substring(j+1, i)" +s.substring(j+1, i+1));
//    	    		System.out.println("s.charAt(j)" +s.charAt(j));
    				maxlist[i]=maxlist[i]+1;
//    				System.out.println("maxlist[i]" +maxlist[i]);
    			}
    			else {
    				break;
    			}
    		}
//    		System.out.println();
//    		System.out.println("done one iteration" );
    	}
    	int max = 1;

    	for (int i = 0;i<s.length();i++){
//    		System.out.println("max" + maxlist[i]);
    		if (maxlist[i]>max){
    			max = maxlist[i];
    		}

    	}
    	
    	return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstringWithoutRepeatingCharacters lo = new LongestSubstringWithoutRepeatingCharacters();
		String s = "bbbbb";
		String s2 = "abcabcbb";
		String s3 = "pwwkew";
		System.out.println(lo.lengthOfLongestSubstring(s));
		System.out.println(lo.lengthOfLongestSubstring(s2));
		System.out.println(lo.lengthOfLongestSubstring(s3));

	}

}
