package javaFundamentals;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {23, 87,45,55,90};
		System.out.println("the Arrays is: "+ Arrays.toString(arr));
		
		int max = arr[0];
		for(int i =1; i<arr.length; i++) {
		if(arr[i]> max) {
			max = arr[i];
			
		}
		}
		System.out.println("Max is: "+ max);
		int min = arr[0];
		for(int i =1; i<arr.length; i++) {
			if(arr[i]< min) {
				min = arr[i];
			}
		}

	}

}
