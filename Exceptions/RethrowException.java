package com.exception;

class Test{
	void display() {
		try{
			String s="Java";
			char c=s.charAt(4);
		}catch(StringIndexOutOfBoundsException e) {
		System.out.println("Enter the correct index position" +e);
		throw e;
	}
}
}
public class RethrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		try {
		t.display();
	}catch (StringIndexOutOfBoundsException e) {
		System.out.println("I caught the rethrow exception");
	}
 }
}
