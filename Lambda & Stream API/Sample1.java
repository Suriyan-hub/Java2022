package com.java8;

interface I{
	public void show();
}
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I obj=()->System.out.println("Hello");
		obj.show();
	}

}
