package com.exception;

public class TestFinally3 {
 //Finally blocks gets executed if exception handled or not
	public static void main(String[] args) {
			try {
					String s="Hello";
					char c=s.charAt(5);
					
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Out of range" +e);
				}
				finally {
					System.out.println("finally blocks get executed");
				}
				System.out.println("End of the code");
	}

}
