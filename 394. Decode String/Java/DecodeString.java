import java.util.Stack;

public class DecodeString {
	public String decodeString(String s) {
        String result = "";
        Stack<String> stringstack = new Stack<String>();
        Stack<Integer> multpstack = new Stack<Integer>();
        int index =0;
        while(index<s.length()){
            if(Character.isDigit(s.charAt(index))){
                int count = 0;
                while(Character.isDigit(s.charAt(index))){
                    count = count*10 +s.charAt(index)-'0';
                    index++;
                }
                multpstack.push(count);

            }
            else if(s.charAt(index)=='['){
                stringstack.push(result);
                result="";
                index++;
            }
            
             else if(s.charAt(index)==']'){
                int repeat = multpstack.pop();
                String temp = result;
                for(int i = 0;i<repeat-1;i++ ){
                    result+=temp;
                }
                result=stringstack.pop()+result;
                index++;
            }
            else{
                result+=s.charAt(index);
                index++;
            }
            
        }
        
        return result;
    }
}
