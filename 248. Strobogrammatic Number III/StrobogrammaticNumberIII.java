import java.util.ArrayList;
import java.util.List;
public class StrobogrammaticNumberIII {
	public int strobogrammaticInRange(String low, String high) {
        int count = 0;
        List<String> result = new ArrayList<String>(); 
        for(int i = low.length();i<=high.length();i++){
            result.addAll(recursive(i,i));
        }
        
        for(String s : result){
            if((s.length() == low.length()&&s.compareTo(low) < 0 ) ||(s.length() == high.length() && s.compareTo(high) > 0)){
                continue;
            }
            count++;
        }
        
        
        
        return count;
        
    }
    
    public List<String> recursive(int m , int n) {

        if(m==0){return new ArrayList<String>(Arrays.asList(""));}
        if(m==1){return new ArrayList<String>(Arrays.asList("0","1","8"));}
        
        List<String> result = new ArrayList<String>();
        List<String> list = recursive(m-2,n);
        
        for(int i = 0; i<list.size();i++){
            String s = list.get(i);
            if(m!=n){
                result.add("0"+s+"0");
            }
            result.add("1"+s+"1");
            result.add("6"+s+"9");
            result.add("9"+s+"6");
            result.add("8"+s+"8");
        }
        return result;
    }
}
