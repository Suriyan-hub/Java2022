package com.wrapperclasses;

public class Autoboxing {
	public static void main(String args[]){  
		 
		int i=30;  
		long l=40;  
		float f=50.0F;  
		  
		//Converting primitives into objects  
		 
		Integer intobj=i;  
		Long longobj=l;  
		Float floatobj=f; 
		System.out.println("Autoboxing Primitive into Objects Implicitly");
		System.out.println("Integer :" +intobj);
		System.out.println("Long :" +longobj);
		System.out.println("Float :" +floatobj);
		
		//Explicitly Converting primitives into objects 
		Integer in=Integer.valueOf(i);
		Long ln=Long.valueOf(l);
		Float fn=Float.valueOf(f);
		System.out.println("Autoboxing Primitive into Objects Explicitly");
		System.out.println("Integer :" +in);
		System.out.println("Long :" +ln);
		System.out.println("Float :" +fn);
		
		
}
}
