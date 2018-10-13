import java.util.Arrays;

public class ReverseWordsinaStringIII {
    public String reverseWords(String s) {
    	String[] unprocessinglist = s.split(" ");
    	String result ="";
    	for(int i=0;i<unprocessinglist.length;i++){
    		char [] array = unprocessinglist[i].toCharArray();
    		int mid = array.length/2;
    		int sLength = array.length-1;
    		char temp;
    		for(int j = 0; j < mid; j++){
    		    temp = array[j];
    		    array[j] = array[sLength-j];
    		    array[sLength-j] = temp;
    		}
    		result +=(i==0)?String.valueOf(array):(" "+String.valueOf(array));
    	}
    	
    	
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsinaStringIII rws =new ReverseWordsinaStringIII();
		System.out.println(rws.reverseWords("Let's take LeetCode contest"));

	}

}
