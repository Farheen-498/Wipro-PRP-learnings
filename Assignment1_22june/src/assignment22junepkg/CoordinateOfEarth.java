package assignment22junepkg;

import java.util.Scanner;

public class CoordinateOfEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the latitude:");
		double latitude1 = sc.nextDouble();
		System.out.println("enter the latitude:");
		double latitude2 = sc.nextDouble();
		System.out.println("enter the longitude:");
		double longitude1 = sc.nextDouble();
		System.out.println("enter the longitude:");
		double longitude2 = sc.nextDouble();
		sc.close();
		
		latitude1 = Math.toRadians(latitude1);
		latitude2 = Math.toRadians(latitude2);
		longitude1 = Math.toRadians(longitude1);
		longitude2 = Math.toRadians(longitude2);
 
		System.out.println("Expected output:");
		
		double  radius = 6371.01;
		double distance = radius * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));
		
		System.out.println("The distance between those points is: "+ distance+" kilometers");
		
		
		

	}

}
