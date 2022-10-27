package com.multithreading;

class TotalCount extends Thread{
	int tCount=0;
	public void run() {
		
		synchronized (this) {
			for(int i=1;i<=10;i++) {
			tCount=tCount+100;
		}
			this.notify();
		}
	}
}
public class InterThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		TotalCount t=new TotalCount();
		t.start();
		//System.out.println("TotalCount: " +t.tCount);
		synchronized (t) {
			t.wait();
			System.out.println("TotalCount: " +t.tCount);
		}
		
	}

}
