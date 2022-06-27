package exceptionpkg;

import java.util.Scanner;

public class AcessElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of element you want to enter ");
		int num = sc.nextInt();
		int []arr = new int[num];
		System.out.println("Enter the  element you want to enter ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
;			
		}
		
		System.out.println("Enter the  element you want to acess ");
		try {
		int acessnum = sc.nextInt();
		System.out.println(" element  "+arr[acessnum]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
