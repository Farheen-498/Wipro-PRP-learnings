package oopsConcept;

public class Case7 {
	static int sum = 0;
    


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double avg=avg(args);
	        System.out.println("The average is : "+avg);
	    }
	static double avg(String [] x) {
        int i = x.length;
     
        for(int j=0; j<i; j++) 
            sum = sum+Integer.parseInt(x[j]);
        return sum/i;

}
	   
}
