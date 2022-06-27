package assignment22junepkg;
import java.util.Scanner;

public class SumOfDigit {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit:");
		 num1 = sc.nextInt();
		 sc.close();
		
		while(num1 >0) {
			 num2 = num1 % 10;
			 sum = sum + num2;
			 num1 = num1/10;
			
		}
		System.out.println("The sum of entered digit is: " + sum);
		
		
	}

}
