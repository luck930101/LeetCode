
public class GreatestCommonDivisorofStrings {
    public String gcdOfStrings(String str1, String str2) {
        String result = "";
        
        if(str1.length()==str2.length()&&!str1.equals(str2)){return result;}
    	
    	String divisor = (str1.length()>str2.length())?str2:str1;
    	String dividend = (str1.length()<str2.length())?str2:str1;
    	for(int i = 1; i<= divisor.length();i++){
    		String current = divisor.substring(0, i);
    		if (dividend.length()%current.length()==0&&divisor.length()%current.length()==0){
    			boolean flag = true;
    			for (int j = 0;j<dividend.length()/current.length();j++){
    				if(!dividend.substring(j*current.length(), (j+1)*current.length()).equals(current)){
    					flag = false;
    				}
    			}
    			for (int k = 0;k<divisor.length()/current.length();k++){
    				if(!divisor.substring(k*current.length(), (k+1)*current.length()).equals(current)){
    					flag = false;
    				}
    			}
    			if (flag == true){
    				result = current;
    			}
    		}
    	}
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("123"=="123");

	}
}
