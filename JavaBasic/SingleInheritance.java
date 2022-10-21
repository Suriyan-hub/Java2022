package com.inheritance;

class Parent{
	int b=10; 
	void display()
	{
		System.out.println("b values is :" +b);
	}
}
class Child extends Parent
{
	void sum(int a)
	{
		int c=a+b;
		System.out.println("Sum is:"+c);
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.display();
		c.sum(10);
		
	}

}
