
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int result = 0;
        for (char c : s.toCharArray()){
        	result = result*10+ (int)c - 65;
        }
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((int)'A');

	}

}
