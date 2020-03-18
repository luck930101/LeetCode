import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new  HashMap<Character,Integer>();
        
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        List<Character> [] bucket = new List[s.length()+1];
        
        for(char key : map.keySet()){
            if(bucket[map.get(key)]==null){
                bucket[map.get(key)] = new ArrayList<Character>();
            }
            bucket[map.get(key)].add(key);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(int j = 0;j<bucket[i].size();j++){
                    for(int k = 0; k <map.get(bucket[i].get(j));k++){
                        sb.append(bucket[i].get(j));
                    }
                }
            }
        }
        
        return sb.toString();
        
    }
}
