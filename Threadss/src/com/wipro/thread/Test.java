package com.wipro.thread;

public class Test extends Thread{
	public void run()
	{
		//System.out.println("hello.. i am a thread");
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.interrupted());
		System.out.println(Thread.interrupted());
		
		
		for(int i =0; i<=5; i++) {
			System.out.println(i +" "+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("seems like you are awake now!!");
			}
			
		}
		//System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		//Thread th = new Thread();
		t.start();
		t.interrupt();
		//System.out.println(t.getPriority());
		//t.setPriority(MIN_PRIORITY);

		
	}

}
