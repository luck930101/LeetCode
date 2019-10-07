public class RemoveVowelsfromaString {
	public String removeVowels(String S) {
		String result = "";
		
		for(char c : S.toCharArray()){
			if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')){
				result+=c;
			}
		}
        return result;
    }
}
