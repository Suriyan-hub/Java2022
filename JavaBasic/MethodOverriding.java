package com.polymorphism;

class A
{
	void show() {
		System.out.println("Parent class");
	}
}
class B extends A
{
	void show() {
		System.out.println("Child class");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.show();
	}

}
