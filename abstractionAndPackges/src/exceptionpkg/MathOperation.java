package exceptionpkg;

public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length == 5) {
			int []arr = new int[args.length];
			int sum = 0;
			double avg = 0;
			try {
			for(int i = 0; i < args.length; i++) 
				arr[i] = Integer.parseInt(args[i]);
				for(int i = 0; i <arr.length; i++) 
					sum = sum + arr[i];
					avg = sum/arr.length;
				
				
			
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println("the sum is: "+ sum);
			System.out.println("the avg is: "+avg); 
		}
	}

}
