package javaFundamentals;


public class Assign17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int num = Integer.parseInt(args[0]);
	        int cpn = num;
	        int rev = 0;
	        while(num != 0){
	            int digit = num % 10;
	            rev = rev * 10 + digit;
	            num /= 10;
	        }
	        if (cpn == rev)
	            System.out.println(cpn + " is a Palindrome");
	        else
	            System.out.println(cpn + " is Not a Palindrome");
	}

}
