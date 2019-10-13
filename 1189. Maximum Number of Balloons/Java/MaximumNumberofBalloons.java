
public class MaximumNumberofBalloons {
	public int maxNumberOfBalloons(String text) {
		
		int[] list = new int [5];
		
		for(char c : text.toCharArray()){
			switch(c) {
			  case 'b':
				  list[0]++;
			    break;
			  case 'a':
				  list[1]++;
			    break;
			  case 'l':
				  list[2]++;
			    break;
			  case 'o':
				  list[3]++;
			    break;
			  case 'n':
				  list[4]++;
			    break;

			}
		}
		list[2]=list[2]/2;
		list[3]=list[3]/2;
		int count = list[0];
		for(int i :list){count= Math.min(count, i);}
		
		return count;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
