package assignment22junepkg;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x= sc.nextInt();
		System.out.println("Enter the second number:");
		int y = sc.nextInt();
		sc.close();
		System.out.println("Swapped numbers:");
		
		x = x+y;
		y = x - y;
		x = x - y;
		System.out.println(x+", "+y);
		

	}

}
