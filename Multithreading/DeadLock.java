package com.multithreading;

class Book extends Thread{
	final String r1="Pencil";
	final String r2="Eraser";	
	public void run() {
		synchronized (r1) {
			System.out.println("Thread1 acquired a lock on resourse1:" + r1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		synchronized (r2) {
			System.out.println("Thread1 acquired a lock on resourse2:" + r2);
		}
	  }
	}
}
class Box extends Thread{
	final String r1="Pencil";
	final String r2="Eraser";	
	public void run() {
		synchronized (r2) {
			System.out.println("Thread2 acquired a lock on resourse2:" + r2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		synchronized (r1) {
			System.out.println("Thread2 acquired a lock on resourse1:" + r1);
		}
	  }
	}
}
public class DeadLock {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book t1=new Book();
		t1.start();
		Box t2=new Box();
		t2.start();
	}

}
