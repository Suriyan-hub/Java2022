package com.multithreading;

public class ExtendThread extends Thread {

	public void run() {
		System.out.println("Thread is running");
		System.out.println(Thread.currentThread().getPriority());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread");
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		ExtendThread t=new ExtendThread();
		t.setPriority(MIN_PRIORITY);
		t.start();
	}

}
