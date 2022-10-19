package com.exception;

public class TestFinally2 {
 //Exception not occurred then also finally blocks get executed
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[10];
			a[6]=20;
		}catch(Exception e) {
			System.out.println("Out of range" +e);
		}
		finally {
			System.out.println("finally blocks get executed");
		}
		System.out.println("End of the code");
	}

}
