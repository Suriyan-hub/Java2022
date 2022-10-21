package com.polymorphism;

public class MethodOverloading {

	void display()
	{
	System.out.println("Welcome");
	}
	void display(int a)
	{
	System.out.println(a);
	}
	void display(int a,String b)
	{
	System.out.println(a); System.out.println(b);
	}
	void display(int a,float b)
	{
	System.out.println(a); System.out.println(b);
	}
	void display(float b,int a)
	{
	System.out.println(a); System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo= new MethodOverloading();
		mo.display();
		mo.display(5);
		mo.display(20.5f, 10);
		mo.display(15, 36.8f);
		mo.display(20, "Veena");
	}

}
