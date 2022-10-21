package com.variables;

public class ParameterReturn {
	
	int display(int a1,int b1)
	{
	int a,b; 
	a=a1;
	b=b1;
	int c=a+b;
	return c;
	}
	public static void main(String[] args)
	{
	ParameterReturn pr=new ParameterReturn(); 
	int r=pr.display(10,20); 
	System.out.println(r);
	}
}


