import java.util.Stack;

public class MinimumCostTreeFromLeafValues {
	public int mctFromLeafValues(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        
        stack.push(Integer.MAX_VALUE);
        
        for(int num : arr){
            while(stack.peek()<=num){
                result += stack.pop()*Math.min(stack.peek(),num);
            }
            
            stack.push(num);
        }
        
        while(stack.size()>2){
            result+= stack.pop()* stack.peek() ;
        }
        
        return result;
    }
}
