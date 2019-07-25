import java.util.ArrayList;

public class DefanginganIPAddress {

    public String defangIPaddr(String address) {
    	
    String result = new String();
    for (int i =0 ; i<address.length() ; i++){
		if(address.charAt(i)=='.'){
			result+="[.]";
		}
		else{
			result+=address.charAt(i);
			}
		}
		
		return result;
	}
    
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefanginganIPAddress newclass = new DefanginganIPAddress();
		System.out.println(newclass.defangIPaddr("1.1.1.1"));


	}
}
