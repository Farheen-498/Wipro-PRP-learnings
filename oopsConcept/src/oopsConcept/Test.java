package oopsConcept;

public class Test {
	
	public static void main(String args[]) {
		 Bird bd = new Bird();
		 bd.eat();
		 bd.sleep();
		 bd.fly();
	
}
}
	 class Bird extends Animal{
		public void fly() {
			System.out.println("i am flying");
		}
		
	}
class Animal{
		public void sleep() {
			System.out.println("I am sleeping");
		}
		public void eat() {
			System.out.println("i am eating");
		}
		 
		 }
		 
	 


