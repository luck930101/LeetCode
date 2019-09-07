
public class MinimumAddtoMakeParenthesesValid {

    public int minAddToMakeValid(String S) {
    	int missingleft = 0;
    	int missingright = 0;
    	for(int i = 0 ; i< S.length();i++){
    		if(S.charAt(i) =='('){
    			missingright++;
    		}
    		else{
    			if(missingright!=0){
    				missingright--;
    			}
    			else{
    				missingleft++;
    			}
    		}
    		
    	}
        return missingleft+missingright;
    }

}
