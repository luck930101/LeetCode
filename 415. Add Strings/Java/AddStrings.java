
public class AddStrings {
	public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length()-1;
        int j = num2.length()-1;
        while(i>=0||j>=0||carry!=0){
            int d1 = 0;
            int d2 = 0;
            
            if(i>=0){d1 = num1.charAt(i)-'0';}
            if(j>=0){d2 = num2.charAt(j)-'0';}
            
            int sum = d1+d2+carry;
            carry = sum/10;
            sb.append(sum%10);
            i--;
            j--;
        }
        
        return sb.reverse().toString();
    }
}
