package com.wipro.thread;

public class Threadcreation extends Thbread {

	public void run() {
		System.out.println("the thread is running fine....");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Threadcreation tc= new Threadcreation();
		Threadcreation tc1= new Threadcreation();
		tc.start();
		tc1.start();
		
		Thbread t =
				Thbread.currentThread();
				System.out.println("Current Thread :" + t);
				t.setName("Demo thread:");
				System.out.println("New name of the thread :" +  t);
				try {
				Thbread.sleep(1000);
				
				}
				catch (InterruptedException e) {
				System.out.println("Main Thread Interrupted");
				}
	}

}
