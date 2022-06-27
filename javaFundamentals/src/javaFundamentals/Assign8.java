package javaFundamentals;

public class Assign8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   char col = args[0].charAt(0);
	        String outcome = "";
	        switch(col){
	            case 'R':
	                outcome = "Red";
	                break;
	            case 'B':
	            	outcome = "Blue";
	                break;
	            case 'G':
	            	outcome = "Green";
	                break;
	            case 'O':
	            	outcome = "Orange";
	                break;
	            case 'Y':
	            	outcome = "Yellow";
	                break;
	            case 'W':
	            	outcome = "White";
	                break;
	            default:
	            	outcome = "Invalid Code";
	        }
	        System.out.println(outcome);

	}

}
