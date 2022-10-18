package com.array;

public class ArrayMethod {

	public static void main(String[] args) {
		
		System.out.println("Array Elements");
		int arr[]=get();  
		
		for(int i:arr)  
			System.out.println(i);  
			
	}

	static int[] get() {
		// TODO Auto-generated method stub
		int a[]= {10,30,50,90,60};
		return a;
	}
}