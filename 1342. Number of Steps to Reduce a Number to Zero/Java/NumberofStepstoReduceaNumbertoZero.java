public class NumberofStepstoReduceaNumbertoZero {
	public int numberOfSteps (int num) {
        int step = 0;
        
        while(num>0){
            if(num%2==0){
                num = num/2;
                step++;
            }
            else{
                num --;
                step++;
            }
        }
        
        return step;
    }
	
	public int numberOfStepsBits (int num) {
		int step = 0;
        while(num>0){
            step += ((num&1) == 0)?1:2;
            num>>=1;
        }
        
        return step -1;
    }
}
