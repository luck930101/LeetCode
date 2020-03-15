import java.util.PriorityQueue;

public class FindMedianfromDataStream {
    PriorityQueue<Integer> large;
    PriorityQueue<Integer> small;

    /** initialize your data structure here. */
    public FindMedianfromDataStream() {
        large = new PriorityQueue<Integer>();
        small = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        small.add(-num);
        large.add(-small.poll());
        if(large.size()>small.size()+1){
            small.add(-large.poll());
        }
    }
    
    public double findMedian() {
        if(small.size()==large.size()){
            return (large.peek()-small.peek())/2.0;
        }
        else{
            return large.peek()*1.0;
        }
    }
}
