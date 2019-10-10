public class FindWordsThatCanBeFormedbyCharacters {
    public int countCharacters(String[] words, String chars) {
    	int[] countlist = new int[words.length];
    	
    	for(int i = 0; i<words.length;i++){
    		int count = 0; 
    		String patter = chars;
    		for(char c : words[i].toCharArray()){
    			if(patter.indexOf(c)!=-1){
    				patter=patter.replaceFirst(Character.toString(c), "");
    				count++;
    				}
    			else{
    				count=0;
    				break;
    				}
    		}
    		
    		countlist[i]=count;
    	}
    	int result = 0;
    	for(int i : countlist){
    		result+=i;
    	}

        return result;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
