package exceptionpkg;
class InvalidAgeException extends Exception{
	public InvalidAgeException() {
		
	System.out.println("Invalid Age");
	}
}

public class Solution {

	public static void main(String[] args) throws  InvalidAgeException{
		// TODO Auto-generated method stub
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		if(age < 18 || age > 64) {
			throw new InvalidAgeException();
		}
		else {
			System.out.println("the name is: "+ name+ "the age is: "+ age);
		}
		

	}

}
