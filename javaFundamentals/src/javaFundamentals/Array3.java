package javaFundamentals;
import java.util.Scanner;
import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {23,98,56,43,45};
		System.out.println("the Arrays is: "+ Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be found: ");
		
		int find = sc.nextInt();
		int i,flag =0;
		
		sc.close();
		
		for(i = 0; i < arr.length; i++) {
			if(find == arr[i]) {
				flag = 1;
				break;
				
			}
		}
		if(flag == 1) {
			System.out.println(i+1);
		}
		else {
			System.out.println("-1");
		}
	}

}
