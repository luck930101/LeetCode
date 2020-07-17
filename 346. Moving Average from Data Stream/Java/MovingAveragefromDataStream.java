
public class MovingAveragefromDataStream {

    /** Initialize your data structure here. */
    
    private int[] pool;
    private int size;
    private int index;
        
    public void MovingAverage(int size) {
        this.size = size;
        this.pool = new int[size];
        this.index = 0;
    }
    
    public double next(int val) {
        pool[index%size] = val;
        index = (index+1);
        double result = 0;
        for(int num :pool){
            result+=num;
        }
        
        return result/(index<size?index:size);
    }
}
