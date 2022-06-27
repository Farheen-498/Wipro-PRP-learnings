package com.wipro.thread;

public class ThreadWithRunnable implements Runnable{
	public void run() {
		System.out.println("this is thread");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ThreadWithRunnable th= new ThreadWithRunnable();
		Thbread t= new Thbread(th);
		//th.run();
		
		
		t.start();
		t.setName("yo thread");
		System.out.println(t.isDaemon());
		
		

	}

}
