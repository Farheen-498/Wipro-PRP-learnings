package exceptionpkg;
import java.util.*;

class InvalidCountryException extends Exception{
	public InvalidCountryException(){
		System.out.println("InvalidException has occurred");
		System.out.println("User outside India can not Register");
	}
}
public class UserRegistration {
	void registerUser(String username, String userCountry) throws InvalidCountryException{
		if(!userCountry.equals("India")) {
			throw new InvalidCountryException();
		}
		else {
			System.out.println("User registration done!!");
		}
			
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the username ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("enter the user country");
		String countryName = sc.nextLine();
		UserRegistration user = new UserRegistration();
		try {
			user. registerUser(name,countryName);
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();

	}

}
