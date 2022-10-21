package com.inheritance;

class Hierparent
{
int a=10;
}
class Hierchild extends Hierparent
{ 
	String s="Grace";
}
class Hierchild1 extends Hierparent
{ 
	int b=20;
}

public class HierarchicalInheriance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hierchild hr=new Hierchild();
		System.out.println("String is :" +hr.s);
		System.out.println("a value :" +hr.a);
		Hierchild1 hr1=new Hierchild1();
		System.out.println("a value :" +hr1.a);
		System.out.println("b value :" +hr1.b);
	}

}
