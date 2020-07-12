import java.util.ArrayList;
import java.util.List;
public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        int[] hash = new int[256];
        int count = 0;
        
        for(char c :p.toCharArray()){
            hash[c]++;
        }
        
        for(int i = 0;i< s.length();i++){
            hash[s.charAt(i)]--;
            if(hash[s.charAt(i)]>=0){
                count++;
            }
            
            if(i>=p.length()){
                hash[s.charAt(i-p.length())]++;
                if(hash[s.charAt(i-p.length())]>0){
                    count--;
                }
            }
            
            if(count == p.length()){
                result.add(i-p.length()+1);
            }
            
        }
            
        return result;
    }
}
