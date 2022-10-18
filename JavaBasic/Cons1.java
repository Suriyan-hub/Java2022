package com.constructor;

public class Cons1 {
		  
		int id;  
		String name;  
		  
		Cons1(){  
		System.out.println("this a default constructor");  
		}  
		  
		Cons1(int i, String n){  
		id = i;  
		name = n;  
		}  
		  
		public static void main(String[] args) {  
		//object creation  
		Cons1 c = new Cons1();  
		System.out.println("\nDefault Constructor values: \n");  
		System.out.println("Student Id : "+c.id + "\nStudent Name : "+c.name);  
		  
		System.out.println("\nParameterized Constructor values: \n");  
		Cons1 c1 = new Cons1(10, "David");  
		System.out.println("Student Id : "+c1.id + "\nStudent Name : "+c1.name);  
		}  
		
}
