import java.util.ArrayList;

public class MyHashMap {
    /** Initialize your data structure here. */
	ArrayList<int []> list = new ArrayList<int []>();
	
    public MyHashMap() {
    	ArrayList<int []> list = new ArrayList<int []>();
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        for (int[] i : list){
        	if (i[0]==key){
        		i[1]=value;
        		return;
        	}
        } 
    	int[] newdata = {key,value};
    	list.add(newdata);
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        for (int[] i : list){
        	if (i[0]==key){
        		return i[1];
        	}
        }   
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
    	for(int i =0; i<list.size();i++){
    		if (key == list.get(i)[0]){
    			list.remove(i);
    		}
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap obj = new MyHashMap();
//		obj.put(key,value);
//		int param_2 = obj.get(key);
//		obj.remove(key);

	}

}
