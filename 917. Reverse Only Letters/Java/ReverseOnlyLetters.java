
public class ReverseOnlyLetters {
	public String reverseOnlyLetters(String S) {
        char [] stringarray = S.toCharArray();
        int pirorindex =0;
        int laterindex = stringarray.length-1;
        while(pirorindex<laterindex){
        	while((int)Character.toLowerCase(stringarray[pirorindex])<97||(int)Character.toLowerCase(stringarray[pirorindex])>122){
        		pirorindex++;
        		if(pirorindex>laterindex){
                    break;
                }
        	}
        	while((int)Character.toLowerCase(stringarray[laterindex])<97||(int)Character.toLowerCase(stringarray[laterindex])>122){
        		laterindex--;
        		if(pirorindex>laterindex){
                    break;
                }
        	}
        	if(pirorindex>laterindex){
                break;
            }
        	char temp = stringarray[pirorindex];
        	stringarray[pirorindex] = stringarray[laterindex];
        	stringarray[laterindex] = temp;
        	pirorindex++;
        	laterindex--;
        }
        
        return String.valueOf(stringarray);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
