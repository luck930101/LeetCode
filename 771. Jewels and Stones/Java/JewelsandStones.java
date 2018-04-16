
public class JewelsandStones {
	
    public int numJewelsInStones(String J, String S) {
    	int count = 0;
		for (int i = 0;i< J.length();i++){
			for (int j = 0;j< S.length();j++){
				if(J.charAt(i)==S.charAt(j)){
					count++;
				}
				
			}
			
		}
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JewelsandStones js = new JewelsandStones();
		System.out.println(js.numJewelsInStones("aA", "aAAbbbb"));
		System.out.println(js.numJewelsInStones("z", "ZZ"));
	}

}
