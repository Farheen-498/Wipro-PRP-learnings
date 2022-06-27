package javaFundamentals;

import java.util.Arrays;

public class Array10 {

	public static void main (String args[]) {
	    int []array = {6,1,6,8,2,2,3};
	    evenOddFunction(array);
	    System.out.println(Arrays.toString(array));
	}

	private static void evenOddFunction(int []data) {
	    int leftSide = 0;
	    int rightSide = data.length - 1;

	    while(rightSide >= leftSide) {
	        if(data[leftSide] % 2 != 0 && data[rightSide] % 2 == 0) {
	            
	             swappEvenOdd(data, leftSide, rightSide);
	             leftSide++;
	             rightSide--;
	        } else {
	            if(data[leftSide] % 2 == 0) {
	                leftSide++;
	            }
	            if(data[rightSide] % 2 == 1) {
	                rightSide--;
	            }
	        }
	    }
	}

	private static void swappEvenOdd(int []data , int left, int right) {
	    
	    int temp = data[left];
	    data[left] = data[right];
	    data[right] = temp;
	}
}