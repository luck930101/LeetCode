
public class PalindromePermutation {
	public boolean canPermutePalindrome(String s) {
		int[] list = new int[128]; 
		for(char c :s.toCharArray()){
			list[c]++;
		}
		boolean hasSingle = false;
		
		for(int i :list){
			if(i%2==0){continue;}
			else{
				if(hasSingle){
					return false;
				}
				else{
					hasSingle=true;
				}
			}
		}
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
