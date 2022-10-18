package com.array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		System.out.println("enter the limit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b[]=new int[n];
		System.out.println("Enter the values");
		for(int i=0;i<b.length;i++){
			b[i]=sc.nextInt();
		}
		System.out.println("array in reversed order");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}
	}
}