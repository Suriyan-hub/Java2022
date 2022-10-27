package com.multithreading;

public class ThreadSleep extends Thread{

	
	public void run() {
		for(int i=0;i<5;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			System.out.println(i+ " "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadSleep t1=new ThreadSleep();
		t1.start();
		ThreadSleep t2=new ThreadSleep();		
		t2.start();
	}

}
