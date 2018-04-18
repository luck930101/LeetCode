
public class JudgeRouteCircle {
	
    public boolean judgeCircle(String moves) {
    	int count_vertical =0;
    	int count_horizental =0;
    	
    	for(int i =0;i<moves.length();i++){
    		if (moves.charAt(i)=='R'){
    			count_vertical++;
    		}
    		else if (moves.charAt(i)=='L'){
    			count_vertical--;
    		}
    		else if (moves.charAt(i)=='U'){
    			count_horizental++;
    		}
    		else if (moves.charAt(i)=='D'){
    			count_horizental--;
    		}
    	}
    	if(count_vertical==0 & count_horizental==0){
    		return true;
    	}
    	else{
    		return false;
    	}
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JudgeRouteCircle jrc = new JudgeRouteCircle();
		System.out.println(jrc.judgeCircle("UD"));
		System.out.println(jrc.judgeCircle("LL"));
	}

}
