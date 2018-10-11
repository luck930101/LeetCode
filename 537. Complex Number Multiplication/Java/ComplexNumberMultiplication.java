
public class ComplexNumberMultiplication {
	
	public String complexNumberMultiply(String a, String b) {
		int real1 = Integer.parseInt(a.split("\\+")[0]);
		int real2 = Integer.parseInt(b.split("\\+")[0]);
		int	imaginary1 = Integer.parseInt((a.split("\\+")[1]).split("i")[0]);
		int	imaginary2 = Integer.parseInt((b.split("\\+")[1]).split("i")[0]);
		System.out.println(real1);
		System.out.println(real2);
		System.out.println(imaginary1);
		System.out.println(imaginary2);
				
        return String.valueOf(real1*real2 + imaginary1*imaginary2*(-1))+"+"+(imaginary1*real2+imaginary2*real1)+'i';
    }

	public static void main(String[] args) {
		String term1 = "1+-1i";
		String term2 ="1+-1i";
		String term3 = "1+-1i";
		String term4 = "0+0i";
		ComplexNumberMultiplication cnm = new ComplexNumberMultiplication();
		System.out.println(cnm.complexNumberMultiply(term3, term4));
	}
}
