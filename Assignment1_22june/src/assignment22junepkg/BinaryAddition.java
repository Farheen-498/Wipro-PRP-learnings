package assignment22junepkg;

import java.util.Scanner;

public class BinaryAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Binary Number:");
		String x= sc.next();
		System.out.println("Enter 2nd Binary Number:");
		String y = sc.next();
		
		int num1= Integer.parseInt(x,2);
		int num2 = Integer.parseInt(y,2);
		int num3 = num1+num2;
		System.out.println("The expected Output is: "+Integer.toBinaryString(num3));

	}

}
