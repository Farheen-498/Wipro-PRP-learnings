package javaFundamentals;

import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {12,32,34,54,56};
		Arrays.sort(arr);
		System.out.println("The sorted Array: ");
		for(int element : arr) {
			System.out.println(element + " "); }

	}

}
