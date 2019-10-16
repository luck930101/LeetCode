
public class DistributeCandiestoPeople {

	public int[] distributeCandies(int candies, int num_people) {
		int[] reslut = new int[num_people];
		int count = 0;
		while (candies>0){
			count++;
			if(count<=candies){
				reslut[(count-1)%num_people]+=count;
				candies-=count;
			}
			else{
				reslut[(count-1)%num_people]+=candies;
				candies=0;
			}
			
		}
        return reslut;
    }
}
