import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set = new HashSet<String>(Arrays.asList(banned));
        HashMap<String, Integer> map = new HashMap<>();
        String result = "";
        int max = 0;
        paragraph = paragraph.toLowerCase();

        paragraph = paragraph.replace("!"," ");
        paragraph = paragraph.replace("?"," ");
        paragraph = paragraph.replace("'"," ");
        paragraph = paragraph.replace(","," ");
        paragraph = paragraph.replace(";"," ");
        paragraph = paragraph.replace("."," ");
        
        String[] arr = paragraph.split("\\s+");
        for(String s : arr){
            if(!set.contains(s)){
                map.put(s, map.getOrDefault(s, 0) + 1);
                if(map.get(s)>max){
                    result = s;
                    max = map.get(s);
                } 
            }
        }
        
        return result;
    }
}
