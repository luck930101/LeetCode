
public class ReverseString {
	public String ReverseString(String s) {
//        String result = "";
//        int stringlength = s.length();
//        for(int i=0;i<stringlength;i++){
//        	result+=s.charAt(s.length()-i-1);
//        }
//        return result;
		char [] array = s.toCharArray();
		int mid = array.length/2;
		int sLength = array.length-1;
		char temp;
		/*traverse until mid instead of whole length or using two pointers*/
		for(int i = 0; i < mid; i++){
		    temp = array[i];
		    array[i] = array[sLength-i];
		    array[sLength-i] = temp;
		}
		return String.valueOf(array);
    }
	
    public void reverseString(char[] s) {
        for(int i = 0 ; i < s.length/2;i++){
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		ReverseString rs = new ReverseString();
		System.out.println(rs.ReverseString(s));

	}

}
