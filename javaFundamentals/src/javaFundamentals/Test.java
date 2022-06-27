package javaFundamentals;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("Number is Negative");
		}
		else if(num > 0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Zero");
		}
		sc.close();
		
	}

}
