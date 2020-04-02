import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
	public List<String> letterCombinations(String digits) {
        char[][] dict = {{},
                         {},
                         {'a','b','c'},
                         {'d','e','f'},
                         {'g','h','i'},
                         {'j','k','l'},
                         {'m','n','o'},
                         {'p','q','r','s'},
                         {'t','u','v'},
                         {'w','x','y','z'}
                        };
        List<String> result = new ArrayList<String>();
        if(digits==null||digits.length()==0){return result;}
        recursive(digits,dict,result,new StringBuilder(),0);
        return result;
        
    }
    
    
    public void recursive(String digits,char[][] dict,List<String> result,StringBuilder sb,int index){
        if(index >= digits.length()){
            result.add(sb.toString());
            return;
        }
        int currentnum = digits.charAt(index)-'0';
        for(int i = 0;i<dict[currentnum].length;i++){
            sb.append(dict[currentnum][i]);
            recursive(digits,dict,result,sb,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
