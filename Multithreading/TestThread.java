package com.multithreading;

public class TestThread extends Thread{

	public void run() {
		//Thread.currentThread().setName("Welcome");
		System.out.println("Thread task:" +Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread t=new TestThread();
		t.setName("Thread1");
		t.start();
		System.out.println("Main task :" +Thread.currentThread().getName());
		TestThread t1=new TestThread();
		t1.setName("Thread2");
		t1.start();
	
	}

}
