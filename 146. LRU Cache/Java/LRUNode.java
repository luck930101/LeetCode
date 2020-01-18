
public class LRUNode {
	public int key;
	public int value;
	public LRUNode prev;
	public LRUNode next;
		
	public LRUNode(int key, int value){
		this.key = key;
		this.value = value;
		this.prev = null;
		this.next = null;
		
	}
}
