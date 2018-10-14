import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsfromTwoSentences {
	public String[] uncommonFromSentences(String A, String B) {
		Map<String,Integer> map=new HashMap<String,Integer>(); 
		String[] alist = A.split(" ");
		String[] blist = B.split(" ");
		for(int i = 0; i < alist.length;i++){
			map.put(alist[i], (map.get(alist[i])==null)?1:map.get(alist[i])+1);
		}
		
		for(int i = 0; i < blist.length;i++){
			map.put(blist[i], (map.get(blist[i])==null)?1:map.get(blist[i])+1);
		}
		ArrayList<String> list = new ArrayList<String>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		 
		    if(entry.getValue() ==1){
		    	list.add(entry.getKey());
		    }
		 
		}
        return list.toArray(new String[0]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
