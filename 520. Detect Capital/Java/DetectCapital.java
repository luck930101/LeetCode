
public class DetectCapital {
	
	public boolean detectCapitalUse(String word) {
		
		Boolean flagAllUpper = true;
		Boolean flagAllLower= true;
		Boolean flagFirstUpper = true;
		
		if(word ==null){
			return false;
		}
		
		if(Character.isUpperCase(word.charAt(0))){
			flagAllLower = false;
		}
		else{
            flagAllUpper = false;
        }
		
		for(int i =1; i < word.length();i++){
			if(Character.isUpperCase(word.charAt(i))){
				flagAllUpper =flagAllUpper & true;
				flagAllLower = flagAllLower& false;
				flagFirstUpper = flagFirstUpper & false;
			}
			
			else{
				flagAllUpper =flagAllUpper & false;
				flagAllLower = flagAllLower& true;
				flagFirstUpper = flagFirstUpper & true;
			}
		}
        return flagAllUpper|flagAllLower|flagFirstUpper;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
