package com.multithreading;

public class RunnableInter implements Runnable{

	public void run() {
		System.out.println("Thread is created using runnable interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableInter r=new RunnableInter();
		Thread t=new Thread(r);
		t.start();

	}

}
