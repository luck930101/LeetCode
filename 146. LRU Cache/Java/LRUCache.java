import java.util.HashMap;

public class LRUCache {
	public int capacity;
	public int size ;
	public HashMap<Integer, LRUNode> cache;
	public LRUNode dummyhead;
	public LRUNode dummytail;
	
	public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.cache = new HashMap<Integer, LRUNode>();
        this.dummyhead = new LRUNode(0,0);
        this.dummytail = new LRUNode(0,0);
        dummyhead.next = dummytail;
        dummytail.prev = dummyhead;
        
    }
    
    public int get(int key) {
    	LRUNode node = cache.get(key);
    	if(node==null){return -1;}
    	else{
        	remove(node);
        	add(node);
        	return node.value;
    	} 
    }
    
    public void put(int key, int value) {
    	if(this.get(key)!= -1){
    		cache.get(key).value = value;
    		return;
    	}
    	LRUNode newnode = new LRUNode(key,value);
    	if(size==capacity){
    		remove(dummyhead.next);
    		add(newnode);
    	}
    	else{
    		add(newnode);
    	}
    
    }
    
    public void add(LRUNode newnode ) {
		this.dummytail.prev.next = newnode;
		newnode.prev = this.dummytail.prev;
		newnode.next = this.dummytail;
		this.dummytail.prev = newnode;
		this.cache.put(newnode.key, newnode);
		size++;
        
    }
    
    public void remove(LRUNode node) {
    	node.prev.next = node.next;
    	node.next.prev = node.prev;
        this.cache.remove(node.key);
        size--;
    }
}
