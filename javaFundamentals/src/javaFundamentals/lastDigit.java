package javaFundamentals;

public class lastDigit {
	public boolean Digit(int a, int b) {
		int modA = a % 10;
		int modB = b % 10;
		

		return (modA == modB );
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lastDigit ld = new lastDigit();
		boolean res= ld.Digit(7,17);
		
		System.out.println(res);

	}

}
