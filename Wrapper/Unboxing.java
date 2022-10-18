package com.wrapperclasses;

public class Unboxing {
	public static void main(String args[])
	{
		Integer iobj= 10;
		Float fobj=20.5f;
		Double dobj=35.67d;
		
		int i=iobj;
		float f=fobj;
		double d=dobj;
		System.out.println("Auto-unboxing Wrapper classes to primitive Implicitly");
		System.out.println("Integer:" +i);
		System.out.println("Float:" +f);
		System.out.println("Double:" +d);
		
		int i1=iobj.intValue();
		float f1=fobj.floatValue();
		double d1=dobj.doubleValue();
		System.out.println("Auto-unboxing Wrapper classes to primitive Explicitly");
		System.out.println("Integer:" +i1);
		System.out.println("Float:" +f1);
		System.out.println("Double:" +d1);
	}
}
