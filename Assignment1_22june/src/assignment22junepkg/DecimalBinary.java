package assignment22junepkg;

import java.util.Scanner;

public class DecimalBinary {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result= "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int digit = num;
		sc.close();
	


		
		while(digit >0) {
			int rem = digit %2;
			result = result + rem;
			digit = digit / 2;
		}
		System.out.println("the decimal to binary of"+ num+ "is: "+ result);
	}

}
