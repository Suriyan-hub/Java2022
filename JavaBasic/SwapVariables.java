package com.variables;

public class SwapVariables {
	
	void display()
	{
	int a=10; 
	int b=20;
	int c=a; 
	a=b; 
	b=c;
	System.out.println("a="+a); 
	System.out.println("b="+b);
	}
	public static void main(String[] args)
	{
		SwapVariables sw=new SwapVariables(); 
		sw.display();
	}
}


