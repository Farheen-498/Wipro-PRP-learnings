package assignment22junepkg;
import java.util.Scanner;

public class Multipliction_table {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to print multiplication table:");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i = 1; i<= 10; i++) {
			System.out.println(num + " x "+ i+ " = "+ num*i);
			
		}
		sc.close();

	}
	

}




	


