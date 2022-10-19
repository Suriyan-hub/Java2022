package com.exception;

public class ArrayIndexOutOfBoundException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			a[6]=10;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("done");
	}
}
