import java.util.Stack;

public class ValidParentheses {
	
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(char c : s.toCharArray()){
			if(c == '('||c == '['||c == '{'){stack.push(c);}
			else if(c == ')'||c == ']'||c == '}'){
				if(stack.isEmpty()){return false;}
				char currentchar = stack.pop();
				if(c == ')'&&!(currentchar=='(')){
					return false;
				}
				if(c == ']'&&!(currentchar=='[')){
					return false;
				}
				if(c == '}'&&!(currentchar=='{')){
					return false;
				}
			}
			else{
				return false;
			}
		}
        return stack.isEmpty();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
