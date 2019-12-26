public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int area;
    	for (int i = 0; i < height.length-1; i++) {
    		for (int j = i+1; j < height.length; j++) {
    			area =(j-i)* (height[i]<height[j]?height[i]:height[j]);
				max = max>area?max:area;
			}
			
		}
     return max;
    }

}
