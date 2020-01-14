
public class TrappingRainWater {
	public int trapDP(int[] height) {
		int sum = 0;
		int maxleft = -1;
		int maxright = -1;
        int[] maxleftarray = new int[height.length];
        int[] maxrightarray = new int[height.length];
        
        for (int i = 0; i < height.length; i++) {
        	maxleft = Math.max(maxleft,height[i]);
        	maxleftarray[i]=maxleft;
		}
        
        for (int i = height.length-1; i >=0; i--) {
        	maxright = Math.max(maxright,height[i]);
        	maxrightarray[i]=maxright;
		}
        
        for (int i = 0; i < height.length; i++) {
        	sum += Math.min(maxleftarray[i],maxrightarray[i])-height[i];
		}
        
        return sum;
    }
		
		
		
	public int trap(int[] height) {
        int sum = 0; 
        int maxaltitude = 0;
        
        for(int h:height){maxaltitude = Math.max(maxaltitude, h);}
        for(int a = 0;a< maxaltitude;a++){
            int leftindex = -1;
        	for(int i = 0;i<height.length;i++){
        		if(height[i]-a>0){
        			if(leftindex==-1){
        				leftindex = i;
        			}
        			else{
        				sum+= i - leftindex -1;
        				leftindex = i;
        			}
        		}
        	}
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
