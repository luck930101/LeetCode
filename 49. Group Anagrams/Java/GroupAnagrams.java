import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        
        for(int i = 0; i < strs.length;i++){
            int[] letters= new int[26];
            
            for(int j = 0;j<strs[i].length();j++){
                letters[strs[i].charAt(j)-'a'] ++;
            }
            String key = Arrays.toString(letters);
            List<String> list = map.getOrDefault(key,new ArrayList<String>());
            list.add(strs[i]);
            map.put(key,list);
        }
        
        return new ArrayList<List<String>>(map.values());
	}
}
