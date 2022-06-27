package javaFundamentals;

public class Assign5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char v = '8';
		if((v >= 65 && v<= 90) || (v >= 97 && v <= 122)) {
			System.out.println("Alphabet");
		}
		else if (v >= 48 && v <= 57) {
			System.out.println("Number");
		}
		
		else {
			System.out.println("Special Character");
		}

	}

}
