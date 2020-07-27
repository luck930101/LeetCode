
public class SplitaStringinBalancedStrings {
	public int balancedStringSplit(String s) {
        int result = 0;
        int remain = 0;
        
        for(char c : s.toCharArray()){
            if(c =='R'){
                remain++;
            }
            else{
                remain--;
            }
            
            if(remain ==0){
                result ++;
            }
        }
        
        return result;
    }
}
