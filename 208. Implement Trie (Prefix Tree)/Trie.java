public class Trie {
	
	TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode(' ');
    } 
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode current = root;
        
        for(char c : word.toCharArray()){
        	if(current.children[c-'a']==null){
        		current.children[c-'a'] = new TrieNode(c);
        	}
    		current = current.children[c-'a'];
        }
        current.isWord = true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode current = root;
        for(char c : word.toCharArray()){
        	if(current.children[c-'a']==null){
        		return false;
        	}
        	else{
        		current = current.children[c-'a'];
        	}
        }
        return current.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(char c : prefix.toCharArray()){
        	if(current.children[c-'a']==null){
        		return false;
        	}
        	else{
        		current = current.children[c-'a'];
        	}
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
