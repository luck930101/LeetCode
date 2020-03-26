import java.util.ArrayList;
import java.util.List;

public class DesignHitCounter {
	private List<Integer> list;

    /** Initialize your data structure here. */
    public DesignHitCounter() {
        list = new ArrayList<Integer>();

    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
        this.list.add(timestamp);
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
        int hits = 0;
        for(int i = 0;i< this.list.size();i++){
            if(timestamp-list.get(i)<300){
                hits++;
            }
        }
        return hits;
    }
}
