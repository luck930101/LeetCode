
public class AddBinary {
	public String addBinary(String a, String b) {
        int indexa = a.length()-1;
        int indexb = b.length() -1;
        int carry = 0;
        StringBuilder sb = new  StringBuilder();
        while(indexa >= 0||indexb >= 0||carry==1){
            int sum = 0;
            sum += indexa >= 0?a.charAt(indexa)-'0':0;
            sum += indexb >= 0?b.charAt(indexb)-'0':0;
            sum += carry;
            
            carry = sum/2;
            sum = sum%2;
            
            sb.append(sum);
            indexa--;
            indexb--;
        }
        
        return sb.reverse().toString();
    }
}
