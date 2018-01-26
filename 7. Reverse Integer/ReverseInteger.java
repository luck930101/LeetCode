
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        int sign = 1;
        String intstring;
        if(x <0){
        	intstring = Integer.toString(x*(-1));
        	sign = -1;
        }
        else{
        	intstring = Integer.toString(x);
        }
        String reversedstring ="";
        for(int i = 0; i<intstring.length();i++){
        	
        	reversedstring+=intstring.charAt(intstring.length()-i-1);
        	
        }
        if (x==-2147483648||(Long.parseLong(reversedstring)*sign)<-2147483648||(Long.parseLong(reversedstring)*sign)>2147483647){
        	return 0;
        }
        result = Integer.parseInt(reversedstring);
        System.out.println(result);
        return result*sign;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger ri = new ReverseInteger();
		ri.reverse(-2147483648);
//		System.out.print(-2147483648*(-1));

	}

}
