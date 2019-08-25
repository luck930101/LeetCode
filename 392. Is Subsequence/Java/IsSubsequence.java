
public class IsSubsequence {

	public boolean isSubsequence(String s, String t) {
		int tindex = 0;
		for (int i = 0;i<s.length();i++){
			while(tindex<t.length()){
				if(s.charAt(i)==t.charAt(tindex)){
					tindex++;
					break;
				}
				else{
					tindex++;
					if(tindex>=t.length()){
						return false;
					}
				}
			}

			
			
		}
        return true;
    }

}
