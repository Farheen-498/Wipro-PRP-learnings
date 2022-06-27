package com.wipro.thread;

public class Thbread  implements Runnable{

	public void run() {
		System.out.println("child thread");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		//Thread.currentThread.setName(helloworld);
		Thread t= new Thread(this);
		
		t.start();
		
		

	}

	
}
