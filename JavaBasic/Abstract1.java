package com.abstraction;

abstract class A
{
	abstract void show();
	void print() {
		System.out.println("Hello World");
	}
}
class B extends A{
	void show() {
		System.out.println("Abstract Method");
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.show();
		b.print();
	}

}
