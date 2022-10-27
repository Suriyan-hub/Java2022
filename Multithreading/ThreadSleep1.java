package com.multithreading;

public class ThreadSleep1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=0;i<=5;i++) {
    	  try {
			Thread.sleep(1000);
			System.out.println(i+ " " +Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
				System.out.println(e);
		}
    	 
      }
	}

}
