package javaFundamentals;

public class Activity1 {
	static int a ,b ,c;
	static void swapThree(){
		a = a + b + c;
		b=a-(b + c);
		c = a - (b + c);
		a = a - (b + c);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = 10;
		b= 20;
		c = 30;
		System.out.println("a = "+ a +"b = "+ b +"c = "+c);
		swapThree();
		System.out.println("a ="+ a +"b ="+ b +"c = "+c);
		
		
		

	}

}
