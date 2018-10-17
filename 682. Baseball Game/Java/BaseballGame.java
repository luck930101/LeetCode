import java.util.Stack;

public class BaseballGame {
	public int calPoints(String[] ops) {
        int sum = 0;
        Stack<Integer> pointstack= new Stack<Integer>();
        for(int i = 0;i<ops.length;i++){
        	switch(ops[i]){
        	
        	case "C" : 
        		sum -=pointstack.pop();
        		break;
        	case "D" : 
        		sum+=pointstack.peek()*2;
        		pointstack.push(pointstack.peek()*2);
        		break;
        	case "+" : 
        		int last = pointstack.pop();
        		int lasttwo = last +pointstack.peek();;
        		sum+=lasttwo;
        		pointstack.push(last);
        		pointstack.push(lasttwo);
        		
        		break;
        	default : 
        		int point = Integer.valueOf(ops[i]);
        		sum +=point;
        		pointstack.push(point);
        		break;
        	}
        }
        return sum;   
    }

	public static void main(String[] args) {
		BaseballGame bg = new BaseballGame();
		String[] ops = {"5","2","C","D","+"};
		String[] ops2 ={"5","-2","4","C","D","9","+","+"};
		
		System.out.println(bg.calPoints(ops));

	}

}
