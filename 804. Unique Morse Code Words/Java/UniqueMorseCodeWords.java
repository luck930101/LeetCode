import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
    	String[] stringls = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	Set<String> set = new HashSet();
    	for (int i = 0;i<words.length;i++){
    		String newcode ="";
    		for(int j = 0; j<words[i].length();j++){
    			newcode+=stringls[((int)(words[i].charAt(j)))-((int)('a'))];
    		}
    		set.add(newcode);
    	}
        return set.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"gin", "zen", "gig", "msg"};
		UniqueMorseCodeWords um = new UniqueMorseCodeWords();
		System.out.println(um.uniqueMorseRepresentations(words));
		

	}

}
