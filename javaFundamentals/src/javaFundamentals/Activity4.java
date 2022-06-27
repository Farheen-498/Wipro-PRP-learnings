package javaFundamentals;
import java.util.Scanner;
public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		//input from the user		
		System.out.print("Enter a Number : ");		
		int numb = sc.nextInt();
		//condition for even
		if(numb  %  2 == 0){								
			System.out.println("Even Number");
		}
		//condition for odd
		else if(numb % 2 != 0){											
			System.out.println("Odd Number");
		}
		else{
			System.out.println("Zero");
		}
		
		sc.close();			
	}

}
