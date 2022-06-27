package assignment22junepkg;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		System.out.println("the factorial of  number is: "+ factorial(num));
		sc.close();
		
		
		
		

	}
	public static double factorial(double num) {
		if(num==0) 
			return 1;
		
		else 
			
			return num*factorial(num - 1);
		
	}

}
