
public class StrobogrammaticNumber {

	public boolean isStrobogrammatic(String num) {
        char[] dict = {'0','1','a','a','a','a','9','a','8','6'};
        for(int i = 0 ; i < (num.length()+1)/2; i++){
            if(num.charAt(i) != dict[num.charAt(num.length()-i-1)-'0'] ){return false;}
        }
        return true;
    }
}
