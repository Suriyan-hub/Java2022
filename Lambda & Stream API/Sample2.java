package com.java8;
interface J{
	public void add(int i,int j);
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J obj=(i,j)->System.out.println("Sum: "+(i+j));
		obj.add(20,30);
	}

}
