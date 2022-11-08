package com.java8;

public class Sample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Runnable r = () ->
	        {
	          System.out.println("Running Thread: "+ Thread.currentThread().getName());
	        };
	        Thread thread1 = new Thread(r);
	        Thread thread2 = new Thread(r);
	 
	        thread1.start();
	        thread2.start();
	}

}
