package assignment22junepkg;
import java.util.*;

public class MinuteConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the minutes:");
		double minutes = sc.nextDouble();
		sc.close();
		
		double minutesYears = 60*24*365;
		double minutesDays = 60*24;
		double years=  (long)(minutes/ minutesYears);
		long days = (int)(minutes/minutesDays)% 525600;
		System.out.println("the days are: "+days+ ", "+"the years are: "+ years);

	}

}
