import java.util.Stack;

public class ScoreofParentheses {
	
    public int scoreOfParentheses(String S) {
    	int current = 0; 
        Stack<Integer> stack = new Stack<Integer>();
        
        for (char c : S.toCharArray()){
        	if(c=='('){
        		stack.push(current);
        		current = 0;
        	}
        	else{
        		current = stack.pop() + Math.max(current *2, 1); 
        	}
        }
        return current;
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
