package com.multithreading;

public class ThreadJoin1 extends Thread {
	static Thread t1;

	public void run() {
		try {
		for(int i=1;i<=5;i++) {
			
			
				t1.join();
				System.out.println(Thread.currentThread().getName() + " " +i);
				Thread.sleep(1000);
			}
		}
			catch (InterruptedException e) {
				System.out.println(e);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		t1=Thread.currentThread();
		ThreadJoin1 t=new ThreadJoin1();
		t.start();
		try {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName() + " " +i);
			
				Thread.sleep(1000);
		}
			} catch (InterruptedException e) {
				System.out.println(e);
			}
	
 
	}
	}
