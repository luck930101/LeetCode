import java.util.Arrays;

public class FindtheDifference {
	public char findTheDifference(String s, String t) {
		char[] sarray = s.toCharArray();
		char[] tarray = t.toCharArray();
		Arrays.sort(sarray);
		Arrays.sort(tarray);
		for(int i =0; i< sarray.length;i++){
			if(sarray[i]!=tarray[i]){
				return tarray[i];
				
			}
		}
		return tarray[tarray.length-1];
		
        
    }
	public char findTheDifference2(String s, String t) {
		int totalsum = 0;
		for(int i =0; i< s.length();i++){
			totalsum += (int)t.charAt(i);
			totalsum -= (int)s.charAt(i);
		}
		totalsum+=t.charAt(t.length()-1);
		return (char)totalsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
