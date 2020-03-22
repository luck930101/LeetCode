import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<String>();
        builder(result, "",0,0,n);

        return result;
    }
    
    public void builder(List<String> result,String s, int open, int close,int n) {
        if((open+close )==n*2){
            result.add(s);           
        }
        
        if(open<n){
            builder(result,s+"(",open+1,close,n);
        }
        
        if(close<open){
            builder(result,s+")",open,close+1,n);
        }
    }
}
