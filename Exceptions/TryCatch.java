package com.exception;

public class TryCatch {
	//Multiple Exception in single catch blocks
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//int a=500/0;
			int a1[]=new int[5];
			a1[6]=30;
		}
		catch(ArithmeticException|ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
		System.out.println("done");
	}
}
