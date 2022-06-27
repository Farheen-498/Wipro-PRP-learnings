package javaFundamentals;
import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num= sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Number is Even");
		}
		
		else {
			System.out.println("Number is Odd");
		}

	}

}
