package com.wipro.thread;

public class Assignment2 extends Thread{
	public void run() {
		for(int i =1; i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Assignment2 a= new Assignment2();
		a.start();
		a.join();
		
		try {
			for(int i =1; i<=20;i++) {
			
				
		
			if(i%2 !=0) {
				
				System.out.println(i);
				
				}
		} 
		}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		

	}

}
