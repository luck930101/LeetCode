import java.util.Stack;

public class MinStack {
	private Stack<Integer> s; 
	private int min;
	
    public MinStack() {
    	this.s = new Stack<Integer>(); 
    	this.min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        this.s.push(min);
    	if (x<min){
    		min = x;
    	}

        this.s.push(x);

    }
    
    public void pop() {
        this.s.pop();
        min = this.s.pop();
    }
    
    public int top() {
        return this.s.peek();
    }
    
    public int getMin() {
        return min;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
