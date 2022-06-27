package com.wipro.thread;

public class Assignment1 extends Thread{
	public void run() {
	
		for(int i =0; i<=10; i++) {
			if(i==6) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println(i);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 a= new Assignment1();
		a.start();
		

	}

}
