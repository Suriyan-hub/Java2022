package com.multithreading;

public class TestDaemon extends Thread{

	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		}
		else {
		System.out.println("Child Thread");
	}
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Thread.currentThread().setDaemon(true); //can't make main thread as daemon thread
		    System.out.println("Main Thread");
			TestDaemon t1=new TestDaemon();
			//t1.start(); //illegalThreadStateException
			t1.setDaemon(true);
			t1.start();
			
	}

}
