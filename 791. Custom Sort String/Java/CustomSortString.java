
public class CustomSortString {
	public String customSortString(String S, String T) {
		char[] chararray = new char[T.length()];
		int arrayindex = 0;
		for(int i =0 ;i<S.length();i++){
			for(int j =0 ;j<T.length();j++){
				if(S.charAt(i)==T.charAt(j)){
					chararray[arrayindex]=S.charAt(i);
					arrayindex++;
				}		
			}
		}
		for(int i =0 ;i<T.length();i++){
			if(S.indexOf(T.charAt(i))==-1){
				chararray[arrayindex] = T.charAt(i);
				arrayindex++;
			}
		}
        return String.valueOf(chararray);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
