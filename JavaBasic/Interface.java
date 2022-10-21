package com.abstraction;

interface A1
{
	void add();
	void sub();
}
class B1 implements A1
{
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum is:" +c);
	}
	public void sub() {
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println("Difference is:" +c);
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b=new B1();
		b.add();
		b.sub();
	}

}
