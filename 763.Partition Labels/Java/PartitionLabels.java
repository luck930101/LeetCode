import java.util.LinkedList;
import java.util.List;
public class PartitionLabels {
	public List<Integer> partitionLabels(String S) {
		List<Integer> result = new LinkedList<Integer>();
		int index = 0;
		int lastindex = 0;
		int range;
		while(index<S.length()){
			range = index ;
			while(!(index>range)){
				range=(range<S.lastIndexOf(S.charAt(index)))?S.lastIndexOf(S.charAt(index)):range;
				
				index++;
			}
			System.out.println(range);
			result.add(range+1-lastindex);
			lastindex = range+1;
			
		}
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartitionLabels pl = new PartitionLabels();
//		System.out.println(pl.partitionLabels("caedbdedda"));
		System.out.println(pl.partitionLabels("ababcbacadefegdehijhklij"));

	}

}
