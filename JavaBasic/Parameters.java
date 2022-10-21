package com.variables;

public class Parameters {
	
	void display(int a1,int b1)
	{
	int a,b,c; 
	a=a1;
	b=b1;
	c=a+b; 
	System.out.println(c);
	}
	public static void main(String[] args)
	{
		Parameters p=new Parameters(); 
		p.display(10,20);
	}
}


