package com.variables;

public class Swap1 {
	
	void display()
	{
	int a=10; 
	int b=20;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a="+a);
	System.out.println("b="+b);
	}
	public static void main(String[] args)
	{
		Swap1 s=new Swap1();
		s.display();
	}
}


