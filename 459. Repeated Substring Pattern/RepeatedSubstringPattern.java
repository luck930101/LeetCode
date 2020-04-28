
public class RepeatedSubstringPattern {
	public boolean repeatedSubstringPattern(String s) {
		/*  repeated patter "p" eg: p = 'abc'
		 *  We have ppp, we want to shift last p to first if still ppp, we can 
		 *  say this is a repeated string,
		 *  we have ppp*2 which is pppppp now, remove first and last (p)pppp(p)
		 *  we have (p)(ppp)p(p), so return true
		 * 
		 * 
		 * */
        String twice = s+s;
        return twice.substring(1,twice.length()-1).contains(s);
    }
}
