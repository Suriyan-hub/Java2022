package com.multithreading;

class Test1{
	synchronized void print(int n) {
		for(int i=1;i<5;i++)
		{
			System.out.println(i*n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
	}
}
class MyThread1 extends Thread{
	Test1 t;
	MyThread1(Test1 t){
		this.t=t;
	}
	public void run() {
		t.print(5);
	}
}
class MyThread2 extends Thread{
	Test1 t;
	MyThread2(Test1 t){
		this.t=t;
	}
	public void run() {
		t.print(50);
	}
}
public class Synchronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		MyThread1 t1=new MyThread1(t);
		MyThread2 t2=new MyThread2(t);
		t1.start();
		t2.start();
			
	}

}


