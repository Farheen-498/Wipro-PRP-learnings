package javaFundamentals;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11, 34, 76, 89, 32};
		
		int sum = 0;
		System.out.println("The Array is: "+ Arrays.toString(arr));
		
		for(int i =1; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of Array is : "+ sum);
		
		double avg = (sum/ arr.length);
		System.out.println("The avg of Array is : "+ avg);

	}

}
