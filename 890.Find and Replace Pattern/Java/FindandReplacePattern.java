import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class FindandReplacePattern {
	public List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> result = new LinkedList<String>();
		List<Integer> finalpattern = new LinkedList<Integer>();
		int patternmark =0;
		HashMap<Character, Integer> patternhashmap = new HashMap<Character, Integer>();
		for (int i = 0; i<pattern.length();i++){
			if(patternhashmap.containsKey(pattern.charAt(i))){
				finalpattern.add(patternhashmap.get(pattern.charAt(i)));
			}
			else{
				patternmark++;
				patternhashmap.put(pattern.charAt(i), patternmark);
				finalpattern.add(patternmark);
			}
		}
		
		
		for (int i = 0; i<words.length;i++){
			List<Integer> wordfinalpattern = new LinkedList<Integer>();
			int wordpatternmark =0;
			HashMap<Character, Integer> wordpatternhashmap = new HashMap<Character, Integer>();
			for (int j = 0; j<words[i].length();j++){
				if(wordpatternhashmap.containsKey(words[i].charAt(j))){
					wordfinalpattern.add(wordpatternhashmap.get(words[i].charAt(j)));
				}
				else{
					wordpatternmark++;
					wordpatternhashmap.put(words[i].charAt(j), wordpatternmark);
					wordfinalpattern.add(wordpatternmark);
					
				}
			}
			if (compare(wordfinalpattern,finalpattern)){
				result.add(words[i]);
			}

		}
        return result;
    }
	
	public boolean compare(List<Integer> l1, List<Integer> l2){
		for(int i = 0;i<l1.size();i++){
			if(l1.get(i)!=l2.get(i)){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindandReplacePattern frp = new FindandReplacePattern();
		String[] words = {"aaa","ccc","bbb"};
		String pattern = "aaa";
		frp.findAndReplacePattern(words, pattern);
	}

}
