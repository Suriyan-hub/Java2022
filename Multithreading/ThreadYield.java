package com.multithreading;

public class ThreadYield extends Thread {

	public void run() {
		for(int i=1;i<=5;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " " +i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadYield t=new ThreadYield();
		t.start();
		//Thread.yield();
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() + " " +i);
		}
	}

}
