package com.inheritance;

class Parentnew
{
	int a=10;
}
class Childnew extends Parentnew
{
	String s="priya";
}
class Child1 extends Childnew
{
	float z=2.5f;
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 sc=new Child1(); 
		System.out.println(sc.a);
		System.out.println(sc.s);
		System.out.println(sc.z);
	}

}
