package com.multithreading;

public class ThreadJoin extends Thread {

	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() + " " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadJoin t=new ThreadJoin();
		t.start();
		t.join();
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() + " " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
	}
	}
}
