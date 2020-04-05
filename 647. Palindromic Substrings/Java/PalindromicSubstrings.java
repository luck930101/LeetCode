
public class PalindromicSubstrings {
	int count = 0;
    public int countSubstrings(String s) {
        for(int i =0;i < s.length();i++){
            expend(s,i,i);
            expend(s,i,i+1);
        }
        return count;
    }
    
    public void expend(String s,int left,int right) {
        if(left<0||right>=s.length()){return;}
            if(s.charAt(left) == s.charAt(right)){
                count++;
                expend(s,left-1,right+1);
            }
    }
	/*my first try
	int count = 0;
    public int countSubstrings(String s) {
        for(int i =0;i < s.length();i++){
            expendsingle(s,i,0);
            expenddouble(s,i,0);
        }
        return count;
    }
    
    public void expendsingle(String s,int index,int distant) {
        if(index-distant<0||index+distant>=s.length()){return;}
            if(s.charAt(index-distant) == s.charAt(index+distant)){
                count++;
                expendsingle(s,index,distant+1);
            }
    }
    
    public void expenddouble(String s,int index,int distant) {
        if(index-distant<0||index+distant+1>=s.length()){return;}
            if(s.charAt(index-distant) == s.charAt(index+distant+1)){
                count++;
                expenddouble(s,index,distant+1);
            }
    }
    */
}
