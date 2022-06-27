package wrapperpkg;

import java.util.Scanner;

public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String output = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
		System.out.println(output);

	}

}
