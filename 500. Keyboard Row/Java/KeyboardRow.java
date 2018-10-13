import java.util.ArrayList;

public class KeyboardRow {
	
	public String[] findWords(String[] words) {
		String row1 = "QWERTYUIOPqwertyuiop";
		String row2 = "ASDFGHJKLasdfghjkl";
		String row3 = "ZXCVBNMzxcvbnm";
		
		ArrayList<String> result = new  ArrayList<String>();
		
		loop:for(int i = 0;i<words.length;i++){
			
			String currentword = words[i];
			
			if(row1.indexOf(currentword.charAt(0))!=-1){
			for(int j = 0 ; j<currentword.length() ; j++){
					if (row1.indexOf(currentword.charAt(j))==-1){
						continue loop;
					}
				}
				result.add(currentword);
			}
			else if(row2.indexOf(currentword.charAt(0))!=-1){
				for(int j = 0 ; j<currentword.length() ; j++){
					if (row2.indexOf(currentword.charAt(j))==-1){
						continue loop;
					}
				}
				result.add(currentword);
			}
			else if(row3.indexOf(currentword.charAt(0))!=-1){
				for(int j = 0 ; j<currentword.length() ; j++){
					if (row3.indexOf(currentword.charAt(j))==-1){
						continue loop;
					}
				}
				result.add(currentword);
			}
		}
		String[] resultarray = new String[result.size()];
		for(int i = 0;i<result.size();i++){
			resultarray[i] = result.get(i);
		}
		return  resultarray;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
