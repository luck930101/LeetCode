
public class TrieNode {
	char c;
	TrieNode[] children;
	boolean isWord;
	
	public TrieNode(char c){
		this.c = c;
		this.children  = new TrieNode[26];
		isWord = false;
	}
}
