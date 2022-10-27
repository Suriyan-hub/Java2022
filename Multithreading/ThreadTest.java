package com.multithreading;

public class ThreadTest extends Thread {

	public void run() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t=new ThreadTest();//Thread is created
		t.start(); // Start the thread and jvm call run()
	}

}
