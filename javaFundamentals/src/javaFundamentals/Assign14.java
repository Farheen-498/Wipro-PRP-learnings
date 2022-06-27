package javaFundamentals;

import java.util.Scanner;

public class Assign14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the 4 digit number..");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		 int sum = 0;
		 while(num!=0) {
			 sum = sum + num % 10;
			 num = num / 10;
		 }
		 System.out.println(sum);

	}

}
