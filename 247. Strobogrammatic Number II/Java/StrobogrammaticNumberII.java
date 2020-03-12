import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class StrobogrammaticNumberII {
	public List<String> findStrobogrammatic(int n) {
        return recursive(n,n);
    }
    
    public List<String> recursive(int m, int n) {
        if(m==0){return new ArrayList<String>(Arrays.asList(""));}
        if(m==1){return new ArrayList<String>(Arrays.asList("0","1","8"));}
        
        List<String> list = recursive(m-2,n);
        List<String> result = new ArrayList<String>();
        
        for(int i =0; i< list.size();i++){
            String s = list.get(i);
            if (m != n) {
                result.add("0" + s + "0");
            }
            result.add("1"+s+"1");
            result.add("6"+s+"9");
            result.add("8"+s+"8");
            result.add("9"+s+"6");
        }
        
        return result;
    }
}
