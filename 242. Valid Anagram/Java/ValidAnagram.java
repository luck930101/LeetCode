
public class ValidAnagram {
	
    public boolean isAnagram(String s, String t) {
    	int[] checklist = new int[26];
    	for (char c : s.toCharArray()){
    		checklist[(int)c-97]++;
    	}
    	for (char c : t.toCharArray()){
    		checklist[(int)c-97]--;
    	}
    	
    	for (int i =0; i<26;i++){
    		if(checklist[i]!=0){
    			return false;
    		}
    	}
    	return true;   
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidAnagram v = new ValidAnagram();
		v.isAnagram("vv", "aa");

	}

}
