package com.array;
import java.util.*;
public class ArraySum {
	public static void main(String[] args){		
		System.out.println("Enter the limit");
		Scanner java1=new Scanner(System.in);
		int n=java1.nextInt();
		int a[]=new int[n];
		int sum=0;
		System.out.println("Enter the value");
		for(int i=0;i<a.length;i++)
		{
			a[i]=java1.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of an array is:" +sum);
	}
}	
	
