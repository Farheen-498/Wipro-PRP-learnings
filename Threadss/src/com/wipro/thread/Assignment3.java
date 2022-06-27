package com.wipro.thread;

public class Assignment3 extends Thread{
	public void run() {
		
		System.out.println(getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment3 a= new Assignment3();
		a.setPriority(MAX_PRIORITY);
		a.start();
		Assignment3 a1= new Assignment3();
		a1.setPriority(MIN_PRIORITY);
		a1.start();
		Assignment3 a2= new Assignment3();
		a2.setPriority(NORM_PRIORITY);
		a2.start();
		

	}

}
